package com.xuechuan.mymodel.解释;
/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyModel
 * @Package com.xuechuan.mymodel.JSFactoty
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/14 9:08
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class OrExpression implements JSFactoty {
    private JSFactoty factoty = null;
    private JSFactoty factoty1 = null;

    public OrExpression(JSFactoty factoty, JSFactoty factoty1) {
        this.factoty = factoty;
        this.factoty1 = factoty1;
    }

    @Override
    public boolean interpret(String context) {
        return factoty.interpret(context) || factoty1.interpret(context);
    }
}
