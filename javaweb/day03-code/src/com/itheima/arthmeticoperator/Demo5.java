package com.itheima.arthmeticoperator;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args){
        /*
        数字6是一个真正伟大的数字，键盘录入两个整数，如果其中一个为6，最终结果输出为true
        如果他们的和为6的倍数，最终结果输出为true
        其他情况为false

         */
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int number1=sc.nextInt();
        System.out.println("请输入第二个整数");
        int number2=sc.nextInt();
        boolean result=number1==6||number2==6||(number1+number2)%6==0;
        System.out.println(result);
    }
}
