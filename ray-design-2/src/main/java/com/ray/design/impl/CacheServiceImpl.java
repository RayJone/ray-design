package com.ray.design.impl;

import com.ray.design.CacheService;
import com.ray.design.util.EGM;
import com.ray.design.util.IIR;
import com.ray.design.util.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 *  if  else  一通实现
 * @author ray_jone@163.com
 * @date 2021/7/22 21:57
 */
public class CacheServiceImpl implements CacheService {

    private RedisUtils redisUtils = new RedisUtils();

    public String get(String key) {
        return redisUtils.get(key);
    }

    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        redisUtils.del(key);
    }
}
