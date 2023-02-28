package com.itheima.test8;

public class StringDemo8 {
    public static void main(String[] args) {
        reverse("abc");
    }
    public static String reverse(String str){
        for (int i = str.length() - 1; i >= 0; i--) {
            char c=str.charAt(i);
            System.out.println(c);
        }
        return "";
    }
}
