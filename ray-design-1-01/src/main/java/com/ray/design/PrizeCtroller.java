package com.ray.design;

import com.ray.design.card.IQiYiCardService;
import com.ray.design.coupon.CouponResult;
import com.ray.design.coupon.CouponService;
import com.ray.design.goods.DeliverReq;
import com.ray.design.goods.GoodsService;

public class PrizeCtroller {
    public AwardRsp sendAward(AwardReq awardReq){
        if(awardReq.getAwardType() == AwardType.IQiYiCard){
            IQiYiCardService iQiYiCardService = new IQiYiCardService();
            iQiYiCardService.grantToken(awardReq.getAwardNumber(),awardReq.getBizId());
        }
        if(awardReq.getAwardType() == AwardType.Coupon){
            CouponService couponService = new CouponService();
            CouponResult couponResult = couponService.sendCoupon(awardReq.getuId(), awardReq.getAwardNumber(), awardReq.getBizId());
            if("0000".equalsIgnoreCase(couponResult.getCode())){
                return new AwardRsp("0000",couponResult.getInfo());
            }else{
                return new AwardRsp("0001",couponResult.getInfo());
            }

        }
        if(awardReq.getAwardType() == AwardType.Goods){
            GoodsService goodsService = new GoodsService();
            DeliverReq deliverReq = new DeliverReq();
            deliverReq.setOrderId(awardReq.getBizId());
            deliverReq.setSku(awardReq.getAwardNumber());
            deliverReq.setUserName(queryUserName(awardReq.getuId()));
            deliverReq.setUserPhone(queryUserPhoneNumber(awardReq.getuId()));
            deliverReq.setConsigneeUserAddress(awardReq.getExtMap().get("consigneeUserAddress"));
            deliverReq.setConsigneeUserName(awardReq.getExtMap().get("consigneeUserName"));
            deliverReq.setConsigneeUserPhone(awardReq.getExtMap().get("consigneeUserPhone"));
            Boolean aBoolean = goodsService.sendGoods(deliverReq);
            if(aBoolean){
                return new AwardRsp("0000","sucess");
            }else{
                return new AwardRsp("0001","fail");
            }
        }
        return new AwardRsp("0000","sucess");
    }


    private String queryUserName(String uId) {
        return "花花";
    }

    private String queryUserPhoneNumber(String uId) {
        return "15200101232";
    }
}
