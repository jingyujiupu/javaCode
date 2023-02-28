package com.itheima.arthmeticoperator;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args){
        /*
        动物园里有两只老虎，体重分别通过键盘录入获得，
        请用程序实现判断两只老虎的体重相同
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重");
        int weight1=sc.nextInt();
        System.out.println("请输入第二个老虎的体重");
        int weight2=sc.nextInt();
        String result=weight1==weight2?"相同":"不同";
        System.out.println(result);
    }
}
