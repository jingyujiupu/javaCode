package com.itheima.test9;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("111");
        list.add("222");
        System.out.println("[");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                System.out.println(list.get(i));
            }else{
                System.out.println(list.get(i)+",");
            }
        }
        System.out.println("]");
    }
}
