package Arraylist;

/**
 * 数组中的常见异常
 * 索引越界异常，空指针异常
 *
 */
public class ArrayExceptionTest {
    public static void main(String[] args){


        int[] arr =new int[]{2,4,5,6,7,8};
        /**
         * 数组长度是6，但索引最多只到5，所以小于等于长度6，会循环到第6个索引导致索引越界
         *
         *     for(int i = 0;i<=arr.length;i++){
         *             System.out.println(arr[i]);
         *         }
         *
         */
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }




    }
}
