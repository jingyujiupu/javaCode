package com.itheima.test9;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        //添加
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        //删除
        /*
        boolean result1=list.remove("aaa");
        boolean result2=list.remove("ddd");
        String str=list.remove(2);//bbb
         */
        //修改
        /*
        String result=list.set(1,"ddd");
         */
        //查询
        /*
        String result=list.get(0);
         */
        //遍历
        for (int i = 0; i < list.size(); i++) {
            String str=list.get(i);
        }
        System.out.println(list);
    }
}
