package com.ray.design.adapter;

import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * @author ray_jone@163.com
 * @date 2021/7/26 21:47
 */
public class MqAdapter {

    public static RebateInfo filter (String strJson, Map<String,String> link){
        return filter(JSON.parseObject(strJson,Map.class),link);
    }

    public static  RebateInfo filter(Map obj,Map<String,String> link){
        RebateInfo rebateInfo = new RebateInfo();
        link.forEach((k,v) ->{
            try {
                String val = obj.get(v).toString();
                RebateInfo.class.getMethod("set"+k.substring(0,1).toUpperCase()+k.substring(1),String.class).invoke(rebateInfo,val);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        return rebateInfo;
    }

}
