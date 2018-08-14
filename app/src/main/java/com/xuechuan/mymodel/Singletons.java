package com.xuechuan.mymodel;

import android.content.Context;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyModel
 * @Package com.xuechuan.mymodel
 * @Description: 单列模式
 * @author: L-BackPacker
 * @date: 2018/8/11 15:51
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class Singletons {
    Context context;

    private static class SingletonHolder {
        private static Context context;
        private static final Singletons INSTANCE = new Singletons(context);
    }

    public Singletons(Context context) {
        this.context = context;
    }

    public static final Singletons getInstance(Context context) {
        SingletonHolder.context = context;
        return SingletonHolder.INSTANCE;
    }
}
