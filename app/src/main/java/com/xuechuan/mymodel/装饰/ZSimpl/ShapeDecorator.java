package com.xuechuan.mymodel.装饰.ZSimpl;

import com.xuechuan.mymodel.装饰.ShapeB;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyModel
 * @Package com.xuechuan.mymodel.ZSFactory.ZSimpl
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/13 14:31
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public abstract class ShapeDecorator implements ShapeB {
    @Override
    public void draw() {
        shapeB.draw();
    }

    protected ShapeB shapeB;

    public ShapeDecorator(ShapeB shapeB) {
        this.shapeB = shapeB;
    }
}
