package com.xuechuan.mymodel.FFactory;

import com.xuechuan.mymodel.原型.Shape;
import com.xuechuan.mymodel.原型.WeigthColor;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyModel
 * @Package com.xuechuan.mymodel.inter
 * @Description: 基类工厂
 * @author: L-BackPacker
 * @date: 2018/8/11 15:26
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public abstract class AbstractFactory {
    /**
     * 获取颜色
     * @param color
     * @return
     */
    public abstract WeigthColor getColor(String color);

    /**
     * 获取园
     * @param shape
     * @return
     */
    public abstract Shape getShape(String shape);
}
