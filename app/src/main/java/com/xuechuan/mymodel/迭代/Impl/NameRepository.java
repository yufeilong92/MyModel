package com.xuechuan.mymodel.迭代.Impl;

import com.xuechuan.mymodel.迭代.ContainerA;
import com.xuechuan.mymodel.迭代.IteratorA;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyModel
 * @Package com.xuechuan.mymodel.DDFactory.Impl
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/14 14:44
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class NameRepository implements ContainerA {
    private String name[] = {"1", "2", "3", "4", "5", "6"};

    @Override
    public IteratorA getInterator() {
        return new NameIterator();
    }

    private class NameIterator implements IteratorA {
        int index;

        @Override
        public boolean hasNext() {
            if (index < name.length)
                return true;
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext())
                return name[index++];
            return null;
        }
    }
}
