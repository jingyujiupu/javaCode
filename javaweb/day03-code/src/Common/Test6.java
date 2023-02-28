package Common;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args){
        //1.分析：把整数里面的每一位放到数组当中
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = Test7.func2(number);
        //2.加密
        //每位数加上5
        //对10取余
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+5;
            arr[i]=arr[i]%10;
        }
        //将所有数字反转
        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        //3.把数组里面的每一个数字进行拼接，变成加密之后的结果
        number=0;
        for (int i = 0; i < arr.length; i++) {
            number=number*10+arr[i];
        }
        System.out.println(number);
    }

}
