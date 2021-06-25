package com.ray.design.coupon;

public class CouponService {
    public CouponResult sendCoupon(String uId,String couponNumber,String uuid){
        System.out.println("发放优惠券,uid="+uId+"couponNumber="+couponNumber+",uuid="+uuid);
        return new CouponResult("0000","sucsess");
    }
}
