package Method;

public class Demo4 {
    //需求：设计一个方法求数组的最大值，并将最大值返回
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int max=getMax(arr);
        System.out.println(max);
    }
    public static int getMax(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
