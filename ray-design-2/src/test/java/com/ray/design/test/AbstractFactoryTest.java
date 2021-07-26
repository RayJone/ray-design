package com.ray.design.test;

import com.ray.design.CacheService;
import com.ray.design.factory.ICacheAdapter;
import com.ray.design.factory.JDKProxy;
import com.ray.design.factory.impl.EGMAdapter;
import com.ray.design.impl.CacheServiceImpl;
import org.junit.Test;
import sun.misc.Cache;

/**
 * @author ray_jone@163.com
 * @date 2021/7/24 10:06
 */
public class AbstractFactoryTest {
    @Test
    public void test() throws Exception {
//        ICacheAdapter proxy = JDKProxy.getProxy(EGMAdapter.class, new EGMAdapter());
        //此处为什么用CacheService？ 而不用ICacheAdapter   适配接口只是为了适配？？
        CacheService proxy = JDKProxy.getProxy(CacheServiceImpl.class, new EGMAdapter());
        proxy.set("name","ray");
        proxy.set("name2","ray2");
        System.out.println(proxy.get("name"));
    }
}
