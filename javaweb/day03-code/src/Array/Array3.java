package Array;

public class Array3 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        /*
        利用循环改进代码
        开始条件：0
        结束条件：数组的长度-1（最大索引）
        调用方式：数组名.length
        拓展：自动的快速生成数组的遍历方法，idea提供的
        数组名.fori
         */
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
