package com.xuechuan.mymodel.原型;

import android.util.Log;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyModel
 * @Package com.xuechuan.mymodel.interImpl
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/11 15:24
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class Green implements WeigthColor {
    public static final String TAG = Green.class.getSimpleName();
    @Override
    public void fill() {
        Log.e(TAG, "fill: " );
    }
}
