package Arraylist;

import java.util.Arrays;

public class ArraryMachine {
    public static void main(String[] args){
        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = new int[]{9,3,2,5};
        boolean isEquals = Arrays.equals( arr1, arr2);//比较两个数组是否相等
        System.out.println(isEquals);

        //输出数组信息
        String str = Arrays.toString(arr1);
        System.out.println(str);

        //将指定的int值分配给指定的int数组的每个元素。
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));

        //对数组排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //二分法查找有序序列
        int[] arr3 = new int[]{-100,-20,33,22,66,77,11};
        System.out.println(Arrays.binarySearch(arr3,22));
    }
}
