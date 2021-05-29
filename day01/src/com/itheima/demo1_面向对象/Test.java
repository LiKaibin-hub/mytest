package com.itheima.demo1_面向对象;


import java.util.Arrays;

//需求：打印数组中所有的元素，打印格式为：[元素1，元素2，元素3，...元素n]
public class Test {
    public static void main(String[] args) {

        //面向过程
        int [] arr = {10,20,30,40,50};
        for (int i = 0;i<arr.length;i++){
            if(i==0){
                System.out.print("["+arr [i]+",");
            }else if(i==arr.length-1){
                System.out.print(arr [i]+"]");
            }else {
                System.out.print(arr[i]+",");
            }

        }


        //面向对象
        System.out.println(Arrays.toString(arr));



    }
}
