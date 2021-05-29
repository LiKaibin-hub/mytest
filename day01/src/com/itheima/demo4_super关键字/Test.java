package com.itheima.demo4_super关键字;


class Fu{
    int sum=10;

    public void show(){
        System.out.println("父类成员方法");
    }

    public Fu(){
        System.out.println("父类无参构造方法");
    }
    public Fu(int num){
        this.sum=num;
        System.out.println("父类有参构造方法");
    }



}
class Zi extends Fu{
    int sum=20;

    @Override
    public void show(){
        System.out.println("子类成员方法");
    }

    public Zi(){

        super.show();
    }
}


public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
    }
}
