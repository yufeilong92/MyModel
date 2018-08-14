package com.xuechuan.mymodel;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyModel
 * @Package com.xuechuan.mymodel
 * @Description: 双检锁/双重校验锁（DCL，即 double-checked locking）
 * @author: L-BackPacker
 * @date: 2018/8/11 15:48
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class Singleton {
    private volatile static Singleton singleton;

    public Singleton() {
    }
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
