package com.xuechuan.mymodel.责任;

import android.util.Log;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyModel
 * @Package com.xuechuan.mymodel.ZRfactory
 * @Description: 创建扩展了该记录器类的实体类。
 * @author: L-BackPacker
 * @date: 2018/8/13 17:32
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int leval) {
        this.leval = leval;
    }

    @Override
    protected void wirte(String message) {
        Log.e("===", "wirte: "+message );
    }
}
