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
public class CacheServiceImplCopy  {

    private RedisUtils redisUtils = new RedisUtils();

    private EGM egm = new EGM();

    private IIR iir = new IIR();



    public String get(String key, int redisType) {
        if (1 == redisType) {
            return egm.get(key);
        }

        if (2 == redisType) {
            return iir.get(key);
        }

        return redisUtils.get(key);
    }

    public void set(String key, String value) {

    }


    public void set(String key, String value, long timeOut, TimeUnit timeUnit) {

    }

    public void del(String key) {

    }
}
