package com.itheima.test8;

public class StringDemo11 {
    public static void main(String[] args) {
        String id="412702199910031122";
        String year=id.substring(6,10);
        String month=id.substring(10,12);
        String day=id.substring(12,14);
        char gender=id.charAt(16);
        int num=gender-48;
        if(num%2==0){
            System.out.println("女");
        }else{
            System.out.println("男");
        }
    }
}
