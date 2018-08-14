package com.xuechuan.mymodel.装饰.ZSimpl;

import android.util.Log;

import com.xuechuan.mymodel.装饰.ShapeB;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyModel
 * @Package com.xuechuan.mymodel.ZSFactory.ZSimpl
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/13 14:32
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class RedShapeDecorator extends ShapeDecorator {
    public static final String TAG = RedShapeDecorator.class.getSimpleName();

    public RedShapeDecorator(ShapeB shapeB) {
        super(shapeB);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(shapeB);
    }

    public void setRedBorder(ShapeB redBorder) {
        Log.e(TAG, "setRedBorder: ");
    }
}
