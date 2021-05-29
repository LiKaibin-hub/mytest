package com.itheima.demo3_private关键字;

public class Test {

    public static void main(String[] args) {
        //概述：private是一个权限修饰符，表示最小的权限（本文件） 私有
        //使用：修饰成员变量，修饰成员方法

        Student s = new Student();
        System.out.println(s.name);
//        System.out.println(s.age);//报错，没有访问权限

    }

}
