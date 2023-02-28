package com.itheima.test8;

public class StringDemo2 {
    public static void main(String[] args) {
        //1.创建两个字符串对象
        String s1=new String("abc");
        String s2="Abc";
        //2.==号比较
        System.out.println(s1==s2); //false
        //3.比较字符串对象中的内容是否相等
        boolean result1=s1.equals(s2);
        System.out.println(result1);//false
        //4.比较字符串对象中的内容是否相等，忽略大小写
        boolean result2=s1.equalsIgnoreCase(s2);
        System.out.println(result2);//true
    }
}
