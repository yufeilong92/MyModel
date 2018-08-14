package com.xuechuan.mymodel.组合;

import java.util.ArrayList;
import java.util.List;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyModel
 * @Package com.xuechuan.mymodel.ZHFactiry
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/13 10:01
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> suboridnates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        suboridnates = new ArrayList<>();
    }

    public void add(Employee e) {
        suboridnates.add(e);
    }

    public void remove(Employee e) {
        suboridnates.remove(e);
    }

    public List<Employee> getSuboridnates() {
        return suboridnates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
