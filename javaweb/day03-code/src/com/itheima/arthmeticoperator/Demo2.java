package com.itheima.arthmeticoperator;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args){
        /*
        您和您的约会对象正试图在餐厅获得一张桌子
        键盘录入两个整数，表示你和你的约会对象衣服的时髦度（手动录入0-10之间的整数，不能录其他)）
        如果你的时髦度大于等于你对象的时髦度，相亲就成功，输出true
        否则输出false
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入我们自己的衣服时髦度");
        int myFashion=sc.nextInt();
        System.out.println("请输入相亲对象衣服的时髦度");
        int girlFashion=sc.nextInt();
        boolean result=myFashion>girlFashion;
        System.out.println(result);
    }
}
