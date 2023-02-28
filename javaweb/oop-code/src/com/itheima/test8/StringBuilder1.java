package com.itheima.test8;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abc");
        //添加元素
        sb.append(1);
        //反转
        sb.reverse();
        //获取长度
        int len=sb.length();
        System.out.println(len);
        //因为StringBuilder是java写好的类，java在底层做了特殊处理，
        //打印对象不是地址值而是属性值
        System.out.println(sb);
        //转换成字符串
        String str=sb.toString();
        System.out.println(str);
    }
}
