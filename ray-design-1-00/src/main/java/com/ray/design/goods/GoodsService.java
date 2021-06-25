package com.ray.design.goods;

import com.alibaba.fastjson.JSON;

public class GoodsService {
    public Boolean sendGoods(DeliverReq deliverReq){
        System.out.println("发送商品，"+ JSON.toJSONString(deliverReq));
        return true;
    }
}
