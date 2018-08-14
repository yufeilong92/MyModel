package com.xuechuan.mymodel.建造;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyModel
 * @Package com.xuechuan.mymodel.Builder
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/11 16:23
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class CokdDrink implements Item {
    @Override
    public String name() {
        return "cokdDrink";
    }

    @Override
    public float price() {
        return 15.5f;
    }

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
