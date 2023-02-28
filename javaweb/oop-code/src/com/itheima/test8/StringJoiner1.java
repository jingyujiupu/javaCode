package com.itheima.test8;

import java.util.StringJoiner;

public class StringJoiner1 {
    public static void main(String[] args) {
        StringJoiner sj=new StringJoiner(",","[","]");
        sj.add("aaa").add("bbb").add("ccc");
        int len=sj.length();
        System.out.println(len);//13
        System.out.println(sj);//[aaa,bbb,ccc]
        String str=sj.toString();
        System.out.println(str);//[aaa,bbb,ccc]
    }

}
