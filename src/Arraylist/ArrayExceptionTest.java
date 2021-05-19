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

          //

        /**
         * 空指针报错一般都是指针指向null值
         *
         * 1.某个元素为null或者整个数组都是null
         int[]  arr1 = new int[]{1,2,3};
         arr1[1] = Integer.parseInt(null);//这个函数可以强转？找个时间搜一下
         arr1 =null;
         System.out.println(arr1[1]);


         2.二维数组赋值的问题
         *  int[][] arr2 = new int[4][];
         *  System.out.println(arr2[0][]);
         *  外层元素是null，没有地址指向内层元素，所以是空指针
         */


    }
}
