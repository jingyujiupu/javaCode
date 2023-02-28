package com.itheima.arthmeticoperator;

public class Demo1 {
    public static void main(String[] args){
        int a=10;
        int b=20;
        a+=b;
        System.out.println(a);
        System.out.println(b);
        //+=,-=,/=,%=底层都隐藏了一个强制类型转换
        short s=1;
        //把左边和右边进行相加，得到结果2，再赋值给左边的变量
        s+=1;
        //等同于s=(short)(s+1)
        System.out.println(s);
    }
}
