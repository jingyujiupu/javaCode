package Array;

import java.util.Random;

public class Array9 {
    public static void main(String[] args){
        /*
    需求：生成1-100之间的随机数存入数组
    1，求出所有数据的和
    2.求所有数据的平均数
    3.统计有多少个数据比平均值小
     */
        int[] arr=new int[10];
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int number=r.nextInt(100)+1;
            arr[i]=number;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //1，求出所有数据的和
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println(sum);
        //2.求所有数据的平均数
        int avg=sum/arr.length;
        System.out.println(avg);
        //3.统计有多少个数据比平均值小
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<avg){
                count++;
            }
        }
        System.out.println(count);
        //遍历数组，验证答案
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
