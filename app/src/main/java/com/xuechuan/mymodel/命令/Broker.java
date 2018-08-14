package com.xuechuan.mymodel.命令;

import java.util.ArrayList;
import java.util.List;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyModel
 * @Package com.xuechuan.mymodel.MlFactory
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/13 18:10
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class Broker {
    private List<Order> orders = new ArrayList<>();

    public void takerOrder(Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        for (Order order : orders) {
            order.execute();
        }
        orders.clear();
    }
}
