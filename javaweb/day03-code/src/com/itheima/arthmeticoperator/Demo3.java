package com.itheima.arthmeticoperator;

public class Demo3 {
    public static void main(String[] args){
        //1.&并且
        //两边都为真，结果才是真
        System.out.println(true&true);//true
        System.out.println(false&false);//false
        System.out.println(true&true);//false
        System.out.println(false&true);//false
        //2.|或者
        //两边都为假，结果才是假
        System.out.println(true|true);//true
        System.out.println(false|false);//false
        System.out.println(true|true);//true
        System.out.println(false|true);//true

        System.out.println(true^true);//false
        System.out.println(false^false);//false
        System.out.println(true^true);//true
        System.out.println(false^true);//true
        //取反的感叹号不要写多次，要么不写，要么只写一次
        System.out.println(!false);//true


    }
}
