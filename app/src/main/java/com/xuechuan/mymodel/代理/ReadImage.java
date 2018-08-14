package com.xuechuan.mymodel.代理;

import android.util.Log;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyModel
 * @Package com.xuechuan.mymodel.DlFactory
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/13 17:19
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class ReadImage implements Image {
    private String fileName;

    public ReadImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void dispaly() {

        Log.d("===", "dispaly: " + fileName);
    }
}
