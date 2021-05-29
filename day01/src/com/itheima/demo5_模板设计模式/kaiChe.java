package com.itheima.demo5_模板设计模式;

public abstract class kaiChe {

    //开车模板
    public void buZhou(){
        System.out.println("开门 点火");
        //开车姿势
        ziShi();
        System.out.println("刹车 熄火");
    }

    protected abstract void ziShi();


}
