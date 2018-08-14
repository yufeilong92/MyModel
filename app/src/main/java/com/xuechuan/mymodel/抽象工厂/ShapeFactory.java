package com.xuechuan.mymodel.抽象工厂;

import com.xuechuan.mymodel.FFactory.AbstractFactory;
import com.xuechuan.mymodel.原型.Shape;
import com.xuechuan.mymodel.原型.WeigthColor;
import com.xuechuan.mymodel.原型.Circle;
import com.xuechuan.mymodel.原型.Rectangle;
import com.xuechuan.mymodel.原型.Square;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyModel
 * @Package com.xuechuan.mymodel.FFactory
 * @Description: 分享工厂
 * @author: L-BackPacker
 * @date: 2018/8/11 15:29
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public WeigthColor getColor(String color) {
        return null;

    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null || shape.equals("")) return null;
        if (shape.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;
    }
}
