package com.xuechuan.mymodel.桥接.DrawAPIImpl;

import android.util.Log;

import com.xuechuan.mymodel.桥接.DrawAPI;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyModel
 * @Package com.xuechuan.mymodel.DrawAPI.DrawAPIImpl
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/11 17:05
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class RedCircle implements DrawAPI {
    public static final String TAG = RedCircle.class.getSimpleName();
    @Override
    public void drawCircle(int radius, int x, int y) {
        Log.e(TAG, "drawCircle: "+radius+x+y );
    }
}
