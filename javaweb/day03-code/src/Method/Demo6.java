package Method;

public class Demo6 {
    //需求：定义一个方法copyOfRange
    //将数组arr中从索引from（包括from）开始，到索引to结束（不包含to）
    //的元素复制到新数组中，将新数组返回
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] copyArr=copyofRange(arr,3,7);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i]+" ");
        }
    }
    public static int[] copyofRange(int[] arr,int from,int to){
        int[] newArr=new int[to-from];
        //伪造索引的思想
        int index=0;
        for (int i = from; i < to; i++) {
            //格式：数组名【索引】=数据值
            newArr[index]=arr[i];
            index++;
        }
        return newArr;
    }
}
