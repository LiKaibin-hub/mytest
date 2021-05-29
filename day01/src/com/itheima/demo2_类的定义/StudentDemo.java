package com.itheima.demo2_类的定义;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.name="李四";
        s.xingBie="男";
        s.age=22;
        System.out.println(s.toString());
        System.out.println(s.name+s.xingBie+s.age);

        s.study("李四");


    }
}
