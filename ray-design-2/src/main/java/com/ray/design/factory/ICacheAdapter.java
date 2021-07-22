package com.ray.design.factory;

import java.util.concurrent.TimeUnit;

/**
 * @author ray_jone@163.com
 * @date 2021/7/22 21:59
 */
public interface ICacheAdapter {

    String get(String key);
    void set(String key,String value);
    void set(String key, String value, long timeOut, TimeUnit timeUnit);
    void del(String key);
}
