package com.ray.design.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ray_jone@163.com
 * @date 2021/7/27 22:27
 */
public class FacePayMode implements IPayMode{

    protected Logger logger = LoggerFactory.getLogger(FacePayMode.class);

    @Override
    public boolean security(String uId) {
        logger.info("刷脸风控。。uId:{}",uId);
        return true;
    }
}
