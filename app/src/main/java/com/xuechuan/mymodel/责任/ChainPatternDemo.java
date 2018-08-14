package com.xuechuan.mymodel.责任;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyModel
 * @Package com.xuechuan.mymodel.ZRfactory
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/13 17:38
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class ChainPatternDemo {
    public static AbstractLogger getChainOfLoggers() {
        ErrorLogger logger = new ErrorLogger(AbstractLogger.ERROR);
        FileLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        ConsoleLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        logger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return logger;
    }
}
