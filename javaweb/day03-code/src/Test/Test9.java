package Test;

import java.util.Random;

public class Test9 {
    public static void main(String[] args){
        //需求:随机数范围1-100
        //创建对象
        Random r=new Random();
        //生成随机数
        int number=r.nextInt(100)+1;//1-100
        System.out.println(number);
        //秘诀：用来生成任意数到任意数之间的随机数
        //1.让这个范围头尾都减去一个值，让这个范围从0开始
        //2.尾巴+1,
        //3.最终的结果，再加上第一步减去的值
    }
}
