package com.itheima.demo2_类的定义;

import org.w3c.dom.ls.LSOutput;

public class Student {

    //属性
    String name;
    String xingBie;
    int age;


    //行为方法

    /**
     * 学习的功能
     * @paam name 姓名
     */
    public void study(String name){
        System.out.println(name+"正在努力学Java");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", xingBie='" + xingBie + '\'' +
                ", age=" + age +
                '}';
    }
}
