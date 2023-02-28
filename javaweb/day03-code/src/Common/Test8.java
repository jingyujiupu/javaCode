package Common;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int[] arr=Func(number);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+5;
            arr[i]=arr[i]%10;
        }
//        int[] tmp = new int[arr.length];
//        int index = arr.length  - 1;
//        for (int i = 0; i < arr.length; i++) {
//            //[1,2,3]
//            tmp[i] = arr[index--];
//        }
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int tmp = arr[left];
            arr[left]= arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }


    }
    public static int[] Func(int number){
        int temp=number;
        int count=0;
        while(number > 0) {
            number=number/10;
            count++;
        }
        int arr[]=new int[count];

        for (int index = arr.length-1; index >=0; index--) {
            int a=temp%10;
            temp=temp/10;
            arr[index]=a;
        }
        return arr;
    }
}
