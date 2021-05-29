package com.itheima.demo2_类的定义;

public class Test {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p.name+p.pice);
        p.name="华为";
        p.pice=2999.99;

        System.out.println(p.name+p.pice);
        p.Call("13669102215");
        p.duanxin("13669102215");
    }

}
