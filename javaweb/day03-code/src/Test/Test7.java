package Test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args){
        //从1开始循环，拿着数字的平方跟原来的数字进行比较
        //如果小于的，那么继续往后推断
        //如果相等，那么当前数字就是平方根
        //如果大于的，那么前一个数字就是平方根的整数部分
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number=sc.nextInt();
        for(int i=1;i<=number;i++){
            if(i*i==number){
                System.out.println(i+"就是"+number+"的平方根");
                break;
            }else if(i*i>number){
                System.out.println((i-1)+"就是"+number+"平方根的整数部分");
                break;
            }
        }
    }
}
