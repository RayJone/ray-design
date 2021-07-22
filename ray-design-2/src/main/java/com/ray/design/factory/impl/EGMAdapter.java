package com.ray.design.factory.impl;

import com.ray.design.factory.ICacheAdapter;
import com.ray.design.util.EGM;

import java.util.concurrent.TimeUnit;

/**
 * @author ray_jone@163.com
 * @date 2021/7/22 22:00
 */
public class EGMAdapter implements ICacheAdapter {
    private EGM redisUtil = new EGM();
    @Override
    public String get(String key) {
        return redisUtil.get(key);
    }

    @Override
    public void set(String key, String value) {
        redisUtil.set(key,value);
    }

    @Override
    public void set(String key, String value, long timeOut, TimeUnit timeUnit) {
        redisUtil.setExpire(key,value,timeOut,timeUnit);
    }

    @Override
    public void del(String key) {
        redisUtil.delete(key);
    }
}
