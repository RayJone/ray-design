package com.ray.design.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * 集群EGM工具
 * @author ray_jone@163.com
 * @date 2021/7/22 21:37
 */
public class EGM {
    private Logger logger = LoggerFactory.getLogger(EGM.class);

    private Map<String,String> dataMap = new HashMap<>();

    public String get(String key){
        logger.info("EGM获取数据,key=[{}]",key);
        return dataMap.get(key);
    }

    public void set(String key,String value){
        logger.info("EGM写入数据,key=[{}],value=[{}]",key,value);
        dataMap.put(key,value);
    }

    public void setExpire(String key, String value, long timeOut, TimeUnit timeUnit){
        logger.info("EGM写入数据Expire,key=[{}],value=[{}],timeOut=[{}],TimeUnit=[{}]",key,value,timeOut,timeUnit);
        dataMap.put(key,value);
    }

    public void delete(String key){
        logger.info("EGM删除数据,key=[{}]",key);
        dataMap.remove(key);
    }
}
