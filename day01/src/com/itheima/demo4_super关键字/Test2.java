package com.itheima.demo4_super关键字;



class Fuu{
    private String name;
    private int age;

    public Fuu(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void show(){
        System.out.println("父类："+name+age);
    }

}

class Zii extends Fuu{


    public Zii(String name,int age){
        super(name,age);
    }
}
public class Test2 {
    public static void main(String[] args) {
        Zii z = new Zii("张三",11);
        z.show();
    }
}
