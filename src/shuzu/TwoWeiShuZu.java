package shuzu;

public class TwoWeiShuZu {
    public static void main(String[] args){
        /** 二维数组的声明和初始化*/

        /**一维数组静态初始化*/
        int[] arr = new int[]{1,2,3};
        /**二维数组静态初始化*/
        int[][] arr1 = new int[][]{{1,2,3,},{4,5},{6,7,8}};
        /**动态初始化，有三个数组，每个数组内有一个2个元素的一维数组*/
        String[][] arr2 = new String[3][2];
        /**只有三行数组，每个数组中没有元素*/
        String[][] arr3 = new String[3][0];

        /**索引1的外围数组中的索引为1的元素*/
        System.out.println(arr1[1][1]);

        /**索引1的数组中的第1个元素，String类型数组默认为空*/
        System.out.println(arr2[1][1]);

        /**给指定索引的数组指定元素个数*/
        arr3[1]= new String[1];
        /**虽然制定了一个元素，但是元素的位置和数组一样都是用索引标记的*/
        System.out.println(arr3[1][0]);
    }
}
