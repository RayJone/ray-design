package com.ray.design;

import com.ray.design.store.ICommodity;
import org.junit.Test;

import java.util.HashMap;

public class DesignTest1_02 {


    @Test
    public void test() throws Exception {
        //爱奇艺
        StoreFactory storeFactory = new StoreFactory();
        ICommodity iQiYicommodityService = storeFactory.getCommodityService(AwardType.IQiYiCard);
        iQiYicommodityService.sendCommodity(null,"QIYI12135353","QIYIQ12512351",null);


        //优惠券
        ICommodity couponCommodityService = storeFactory.getCommodityService(AwardType.Coupon);
        couponCommodityService.sendCommodity("1000777","CP12135353","CP12512351",null);


        //商品
        ICommodity goodsCommodityService = storeFactory.getCommodityService(AwardType.Goods);
        goodsCommodityService.sendCommodity("100006666","GD12135353","GD12512351",new HashMap<String,String>(){
            {
                put("consigneeUserName","大力");
                put("consigneeUserPhone","1312222222");
                put("consigneeUserAddress","北京朝阳");
            }
        });

    }
}
