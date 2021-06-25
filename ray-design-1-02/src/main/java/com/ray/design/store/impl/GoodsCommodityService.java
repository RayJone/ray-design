package com.ray.design.store.impl;

import com.ray.design.AwardReq;
import com.ray.design.AwardType;
import com.ray.design.goods.DeliverReq;
import com.ray.design.goods.GoodsService;
import com.ray.design.store.ICommodity;

import java.util.HashMap;
import java.util.Map;

public class GoodsCommodityService implements ICommodity {
    GoodsService goodsService = new GoodsService();
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setUserName(queryUserName(uId));
        deliverReq.setUserPhone(queryUserPhoneNumber(uId));
        deliverReq.setSku(commodityId);
        deliverReq.setOrderId(bizId);
        deliverReq.setConsigneeUserName(extMap.get("consigneeUserName"));
        deliverReq.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));
        deliverReq.setConsigneeUserAddress(extMap.get("consigneeUserAddress"));
        goodsService.sendGoods(deliverReq);
    }

    private String queryUserName(String uId) {
        return "花花";
    }

    private String queryUserPhoneNumber(String uId) {
        return "15200101232";
    }
}
