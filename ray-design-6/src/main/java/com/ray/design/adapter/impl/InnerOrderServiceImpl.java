package com.ray.design.adapter.impl;

import com.ray.design.adapter.OrderAdapterService;

/**
 * @author ray_jone@163.com
 * @date 2021/7/26 21:40
 */
public class InnerOrderServiceImpl implements OrderAdapterService {

    private InnerService innerService = new InnerService();

    @Override
    public boolean isFirst(String uId) {
        return innerService.orderCount(uId) >= 1;
    }
}
