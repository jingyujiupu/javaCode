package com.itheima.test8;

public class StringDemo12 {
    public static void main(String[] args) {
        String talk="你玩的真好，以后不要在玩了，TMD，CNM";
        String[] arr={"TMD","CNM","SB","MLGB"};
        for (int i = 0; i < arr.length; i++) {
            talk=talk.replace(arr[i],"***");
        }
        System.out.println(talk);
    }
}
