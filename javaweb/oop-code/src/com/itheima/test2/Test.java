package com.itheima.test2;

public class Test {
    public static void main(String[] args) {
        //创建女朋友的对象
        GirlFriend gf=new GirlFriend();
        gf.setAge(1);
        gf.setGender("萌妹");
        gf.setName("可莉");
        System.out.println(gf.getName());
        System.out.println(gf.getGender());
        System.out.println(gf.getAge());
    }
}
