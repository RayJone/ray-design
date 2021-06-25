package com.ray.design.test;

import com.ray.design.AwardReq;
import com.ray.design.AwardType;
import com.ray.design.PrizeCtroller;
import org.junit.Test;

import java.util.HashMap;

public class DesignTest1_01 {

    @Test
    public void test101(){
        //爱奇艺
        PrizeCtroller prizeCtroller = new PrizeCtroller();
        AwardReq aiQiYi = new AwardReq();
        aiQiYi.setAwardType(AwardType.IQiYiCard);
        aiQiYi.setAwardNumber("111111");
        aiQiYi.setBizId("IQY13524353622");
        prizeCtroller.sendAward(aiQiYi);



        //优惠券
        PrizeCtroller couponCtrl = new PrizeCtroller();
        AwardReq couponReq = new AwardReq();
        couponReq.setAwardType(AwardType.Coupon);
        couponReq.setAwardNumber("YHQ001");
        couponReq.setBizId("YHQ46457567456");
        couponReq.setuId("1000000747");
        couponCtrl.sendAward(couponReq);


        //优惠券
        PrizeCtroller goodsCtrl = new PrizeCtroller();
        AwardReq goodsReq = new AwardReq();
        goodsReq.setAwardType(AwardType.Goods);
        goodsReq.setAwardNumber("SP001");
        goodsReq.setBizId("SP46457567456");
        goodsReq.setuId("1000000747");
        goodsReq.setExtMap(new HashMap<String,String>(){
            {
                put("consigneeUserName","大力");
                put("consigneeUserPhone","1312222222");
                put("consigneeUserAddress","北京朝阳");
            }
        });
        goodsCtrl.sendAward(goodsReq);
    }
}
