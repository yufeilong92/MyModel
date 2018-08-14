package com.xuechuan.mymodel.桥接;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyModel
 * @Package com.xuechuan.mymodel.DrawAPI
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/11 17:08
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class ACircle extends AShape {
    private int x,y,radius;
    protected ACircle(DrawAPI drawAPI) {
        super(drawAPI);
    }

    public ACircle(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
         drawAPI.drawCircle(radius,x,y);
    }
}
