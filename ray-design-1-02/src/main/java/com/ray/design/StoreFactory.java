package com.ray.design;

import com.ray.design.store.ICommodity;
import com.ray.design.store.impl.CardCommodityService;
import com.ray.design.store.impl.CouponCommodityService;
import com.ray.design.store.impl.GoodsCommodityService;

public class StoreFactory {
    public ICommodity getCommodityService(AwardType awardType){
        if(awardType == null) return null;
        if(awardType == AwardType.IQiYiCard) return new CardCommodityService();
        if(awardType == AwardType.Coupon) return new CouponCommodityService();
        if(awardType == AwardType.Goods) return new GoodsCommodityService();
        throw new RuntimeException("未知的商品类型");
    }
}
