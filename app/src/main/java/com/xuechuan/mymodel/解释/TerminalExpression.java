package com.xuechuan.mymodel.解释;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyModel
 * @Package com.xuechuan.mymodel.JSFactoty
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/14 9:06
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class TerminalExpression implements JSFactoty {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data))
            return true;
        return false;
    }
}
