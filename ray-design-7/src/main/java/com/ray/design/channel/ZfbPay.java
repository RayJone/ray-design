package com.ray.design.channel;

import com.ray.design.mode.FacePayMode;
import com.ray.design.mode.IPayMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @author ray_jone@163.com
 * @date 2021/7/27 22:26
 */
public class ZfbPay extends  Pay{

    protected Logger logger = LoggerFactory.getLogger(ZfbPay.class);


    public ZfbPay(IPayMode payMode){
        super(payMode);
    }
    @Override
    String transfer(String uId, String tradeId, BigDecimal amount) {
        boolean security = payMode.security(uId);
        if(security){
            logger.info("zfb通过风控..");
            logger.info("zfb转账");
        }else{
            logger.info("zfb用户有风险,uId={}",uId);
        }
        return null;
    }
}
