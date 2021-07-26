package com.ray.design.adapter.impl;

import com.ray.design.adapter.OrderAdapterService;

/**
 * @author ray_jone@163.com
 * @date 2021/7/26 21:43
 */
public class POPOutServiceImpl implements OrderAdapterService {
    private POPService popService = new POPService();
    @Override
    public boolean isFirst(String uId) {
        return popService.isFirstOrder(uId);
    }
}
