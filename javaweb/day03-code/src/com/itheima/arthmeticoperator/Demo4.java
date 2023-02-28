package com.itheima.arthmeticoperator;

public class Demo4 {
    public static void main(String[] args){
        //1.&&并且
        //两边都为真，结果才是真
        System.out.println(true&&true);//true
        System.out.println(false&&false);//false
        System.out.println(true&&true);//false
        System.out.println(false&&true);//false
        //2.||或者
        //两边都为假，结果才是假
        System.out.println(true||true);//true
        System.out.println(false||false);//false
        System.out.println(true||true);//true
        System.out.println(false||true);//true
        //短路逻辑运算符具有短路功能
        //简单理解，当左边的表达式能确定最终的结果，右边就不会参与运算了
        int a=10;
        int b=10;
        boolean result=++a<5&&++b<5;
        System.out.println(a);//11
        System.out.println(b);//10

    }

}
