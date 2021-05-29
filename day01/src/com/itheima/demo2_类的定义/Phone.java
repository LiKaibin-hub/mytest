package com.itheima.demo2_类的定义;

public class Phone {
    //属性
    String name;
    Double pice;

    //行为

    /**
     * 打电话的功能
     * * @param phoneNum 电话号码
     */
    public void Call(String phoneNum){
        System.out.println("正在给"+phoneNum+"打电话");
    }

    /**
     * 发短信的功能
     * @param phoneNum 电话号码
     */
    public void duanxin(String phoneNum){
        System.out.println("正在给"+phoneNum+"发短信");
    }

}
