import com.alibaba.fastjson.JSON;
import com.ray.design.adapter.MqAdapter;
import com.ray.design.adapter.RebateInfo;
import com.ray.design.adapter.mq.OrderMq;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ray_jone@163.com
 * @date 2021/7/26 21:57
 */
public class TestAdapter {

    @Test
    public   void test(){
        OrderMq orderMq = new OrderMq();
        orderMq.setOrderId("O123");
        orderMq.setSku("sku222");
        orderMq.setCreateOrderTime(new Date());
        orderMq.setUid("10002");

        System.out.println("适配前："+orderMq.toString());

        Map<String,String> map = new HashMap<>();
        map.put("userId","uid");
        map.put("bizId","orderId");
        map.put("bizTime","createOrderTime");
        map.put("desc","sku");
        RebateInfo filter = MqAdapter.filter(JSON.toJSONString(orderMq), map);
        System.out.println("适配后："+JSON.toJSONString(filter));
    }
}
