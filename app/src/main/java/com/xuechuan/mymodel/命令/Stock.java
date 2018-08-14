package com.xuechuan.mymodel.命令;

import android.util.Log;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyModel
 * @Package com.xuechuan.mymodel.MlFactory
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/13 18:05
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class Stock {
    private String name = "abc";
    private int quantity = 10;

    public void buy() {
        Log.e("===", name + "buy: " + quantity);
    }

    public void sell() {
        Log.e("===", name + "sell: " + quantity);
    }

  public void run(){
      Log.e("===", name + "run: " + quantity);
  }

}
