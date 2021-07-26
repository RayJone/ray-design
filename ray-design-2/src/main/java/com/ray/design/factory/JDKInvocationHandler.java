package com.ray.design.factory;


import com.ray.design.util.ClassLoaderUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*
   代理类    执行处理器；代理类实例执行时，会分发到invoke(xxx)此方法执行
 */
public class JDKInvocationHandler implements InvocationHandler {

    private ICacheAdapter cacheAdapter;

    public JDKInvocationHandler(ICacheAdapter cacheAdapter) {
        this.cacheAdapter = cacheAdapter;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // ClassLoaderUtils.getClazzByArgs(args)   为啥 要将Long类型的参数 转为 long.class???
        //   Class类只有这一个方法 public Method getMethod(String name, Class<?>... parameterTypes)
        return ICacheAdapter.class
                //获取 ICacheAdapter 同名、参数相同给的方法
                .getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args))
                .invoke(cacheAdapter, args);
    }

}
