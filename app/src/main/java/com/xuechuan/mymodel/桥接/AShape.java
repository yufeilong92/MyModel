package com.xuechuan.mymodel.桥接;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyModel
 * @Package com.xuechuan.mymodel.DrawAPI
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/11 17:07
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public abstract class AShape {
    protected DrawAPI drawAPI;
    protected AShape(DrawAPI drawAPI){
        this.drawAPI=drawAPI;
    }
    public abstract void draw();
}
