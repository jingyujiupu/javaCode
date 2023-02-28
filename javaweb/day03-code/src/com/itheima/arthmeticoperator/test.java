package com.itheima.arthmeticoperator;

import java.util.Scanner;

public class test {
    public static void main(String[] args){
        //键盘录入一个三位数，获取其中的个位，十位，百位
        //1.键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number=sc.nextInt();
        //2.获取个位，十位，百位
        //公式：
        //个位：数字%10
        //十位：数字/10%10
        //百位：数字/10/10%10
    }
}
