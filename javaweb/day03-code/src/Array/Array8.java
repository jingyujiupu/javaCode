package Array;

public class Array8 {
    public static void main(String[] args){
        /*
        定义数组求最大值：33，5，22，44，55
        拓展问题：
        max默认值不能为0，一定要是数组中的值
        循环中开始条件如果为0，那么第一次循环就是跟自己比了一下，对结果没有任何影响，
        但是效率偏低，为了提高效率，减少一次循环的次数，循环开始条件可以写1
         */
        int[] arr={33,5,22,44,55};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }

}
