package com.itheima.arthmeticoperator;

public class ArithmeticoperatorDemo3 {
    public static void main(String[] args){
        byte b1=100;
        byte b2=100;
        byte result=(byte)(b1+b2);//56
        System.out.println(result);//结果就发生错误了。因为要转换的错误过大
    }
}
