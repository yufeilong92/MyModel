package com.xuechuan.mymodel.抽象工厂;

import com.xuechuan.mymodel.FFactory.AbstractFactory;
import com.xuechuan.mymodel.原型.Shape;
import com.xuechuan.mymodel.原型.WeigthColor;
import com.xuechuan.mymodel.原型.Blue;
import com.xuechuan.mymodel.原型.Green;
import com.xuechuan.mymodel.原型.Red;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyModel
 * @Package com.xuechuan.mymodel.FFactory
 * @Description: 颜色工厂
 * @author: L-BackPacker
 * @date: 2018/8/11 15:31
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public WeigthColor getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
