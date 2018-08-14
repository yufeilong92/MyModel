package com.xuechuan.mymodel.解释;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyModel
 * @Package com.xuechuan.mymodel.JSFactoty
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/14 9:09
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class AndExpression implements JSFactoty {
    private JSFactoty expr1 = null;
    private JSFactoty expr2 = null;

    public AndExpression(JSFactoty expr1, JSFactoty expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
