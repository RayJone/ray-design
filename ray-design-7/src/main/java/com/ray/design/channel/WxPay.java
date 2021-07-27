package com.ray.design.channel;

import com.ray.design.mode.IPayMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @author ray_jone@163.com
 * @date 2021/7/27 22:26
 */
public class WxPay extends Pay{

    protected Logger logger = LoggerFactory.getLogger(WxPay.class);

    public WxPay(IPayMode  payMode){
        super(payMode);
    }

    @Override
    String transfer(String uId, String tradeId, BigDecimal amount) {
        boolean security = payMode.security(uId);
        if(security){
            logger.info("wx通过风控..");
            logger.info("wx转账");
        }else{
            logger.info("wx用户有风险,uId={}",uId);
        }
        return null;
    }
}
