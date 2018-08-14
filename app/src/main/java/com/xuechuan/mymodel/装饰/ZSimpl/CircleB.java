package com.xuechuan.mymodel.装饰.ZSimpl;

import android.util.Log;

import com.xuechuan.mymodel.装饰.ShapeB;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyModel
 * @Package com.xuechuan.mymodel.ZSFactory.ZSimpl
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/13 14:29
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class CircleB implements ShapeB {
    public static final String TAG = CircleB.class.getSimpleName();

    @Override
    public void draw() {
        Log.e(TAG, "draw: " );
    }
}
