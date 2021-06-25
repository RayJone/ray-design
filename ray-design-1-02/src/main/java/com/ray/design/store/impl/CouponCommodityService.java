package com.ray.design.store.impl;

import com.ray.design.coupon.CouponService;
import com.ray.design.store.ICommodity;

import java.util.Map;

public class CouponCommodityService implements ICommodity {
    CouponService couponService = new CouponService();
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        couponService.sendCoupon(uId,commodityId,bizId);
    }
}
