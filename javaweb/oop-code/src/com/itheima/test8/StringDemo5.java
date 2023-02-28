package com.itheima.test8;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        //1.键盘录入一个字符串
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(0);
            System.out.println(c);
        }
    }
}
