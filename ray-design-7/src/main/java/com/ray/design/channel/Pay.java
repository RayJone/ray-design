package com.ray.design.channel;

import com.ray.design.mode.IPayMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @author ray_jone@163.com
 * @date 2021/7/27 22:21
 */
public abstract  class Pay {
    protected Logger logger = LoggerFactory.getLogger(Pay.class);
    protected IPayMode payMode;
    public  Pay(IPayMode payMode){
        this.payMode = payMode;
    }
    abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
