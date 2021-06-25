package com.ray.design.store.impl;

import com.ray.design.card.IQiYiCardService;
import com.ray.design.store.ICommodity;

import java.util.Map;

public class CardCommodityService implements ICommodity {
    private IQiYiCardService qiYiCardService= new IQiYiCardService();
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        qiYiCardService.grantToken(commodityId,bizId);
    }
}
