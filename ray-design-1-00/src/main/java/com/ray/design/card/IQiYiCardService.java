package com.ray.design.card;

public class IQiYiCardService {

    //发放爱奇艺会员卡
    public void grantToken(String bindMobileNum,String cardId){
        System.out.println("发放爱奇艺会员，mobile=["+bindMobileNum+"]card=["+cardId+"]");
    }
}
