package com.itheima.test8;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        String username="tm";
        String password="89";
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("输入用户名");
            String username1=sc.next();
            System.out.println("输入密码");
            String password1=sc.next();
            if(username1.equals(username)&&password1.equals(password)){
                System.out.println("登陆成功");
            }else{
                if(i==2){
                    System.out.println("锁定");
                }else{
                    System.out.println("输入错误");
                }
            }
        }
    }
}
