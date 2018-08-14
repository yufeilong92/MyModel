package com.xuechuan.mymodel.桥接;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyModel
 * @Package com.xuechuan.mymodel.DrawAPI
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/11 17:22
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class BCirlcle extends AShape {
    private int x,y, radio;
    protected BCirlcle(DrawAPI drawAPI) {
        super(drawAPI);
    }
    public BCirlcle(DrawAPI drawAPI, int x, int y, int radio) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radio = radio;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radio,x,y);
    }

}
