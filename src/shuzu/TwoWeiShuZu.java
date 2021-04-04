package shuzu;
/**
 * @author $zhanghongyu
 * USER 表示主机名
 * @date ${DATE} ${TIME}
 * DATA 为文档创建日期，TIME 为详细创建时间
 */
public class TwoWeiShuZu {
    public static void main(String[] args){

        /**一维数组静态初始化*/
        int[] arr = new int[]{1,2,3};
        /**二维数组静态初始化*/
        int[][] arr1 = new int[][]{{1,2,3,},{4,5},{6,7,8}};


        System.out.println("--------------------");
        /**动态初始化，有三个数组，每个数组内有一个2个元素的一维数组*/
        String[][] arr2 = new String[3][2];

        /**只有三行数组，每个数组中没有元素*/
        String[][] arr3 = new String[3][0];

        System.out.println("------获取内层数组元素的值--------------");
        /**获取索引1的外围数组中的索引为1的元素*/
        System.out.println(arr1[1][1]);

        /**获取索引1的数组中的第1 个元素，String类型数组默认为空*/
        System.out.println(arr2[1][1]);

        /**给指定索引的数组指定元素个数*/
        arr3[1]= new String[1];
        /**虽然指定了一个元素，但是元素的位置和数组一样都是用索引标记的*/
        System.out.println(arr3[1][0]);


        /**获取数组的长度*/
        System.out.println("------获取数组的长度--------------");
        System.out.println("arr1数组的长度是"+arr1.length);
        System.out.println("arr1数组第一个子数组的长度是"+arr1[0].length);
        System.out.println("arr1数组第二 个子数组的长度是"+arr1[1].length);


        /**遍历二维数组*/
        /**获取外围数组的长度*/
        for(int i=0;i<arr1.length;i++){
            /**获取内层数组的长度*/
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println("------内存解析1--------------");

        String[][] arr5 = new String[4][3];
        /**数组的初始化如果外层和内层都初始化了，外层数组存放初始值是是数组的地址值*/
        System.out.println(arr5[0]);
        System.out.println(arr5[1]);
        System.out.println(arr5[2]);
        System.out.println(arr1[0][0]);



        System.out.println("--------内存解析2------------");
        /**数组的初始化如果只有外层初始化了，外层数组存放初始值是是null，实际上存放的是没有初始化的内层的一维数组String[]，一维数组是引用类型，
         * 不论一维数组的类型是int，还是String，还是float，都是一维数组，null是一维数组的默认值*/
        String[][] arr6 = new String[4][];
        System.out.println(arr6[0]);

        /**System.out.println(arr6[0][0]);
         * 会报空指针异常，因为外围数组的默认值是null，没有地址值指向内层数组，
         * 因此在外层地址没有地址值的情况下获取内层数组的值会报空指针异常*/
    }
}
