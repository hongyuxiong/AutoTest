package Arraylist;


import java.util.Arrays;

public class ArraryMaoPao {
    public static void main(String[] args) {
        //冒泡排序算法
        int[] num=new int[]{1,5,8,2,3,9,4};
        ////外层循环控制排序趟数  length-1次冒泡
        for(int i=0;i<num.length-1;i++)
        {
            ////内层for循环控制比较的次数
            for(int j=0;j<num.length-1-i;j++)
            {
                if(num[j]>num[j+1])
                {
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        System.out.println("从小到大排序后的结果是:");
        for(int i=0;i<num.length;i++) {
            System.out.print(num[i] + " ");
        }
        //打印冒泡排序后的数组，两种写法
        System.out.println("-----------------------------------");
        System.out.println("冒泡排序完成："+ Arrays.toString(num));

    }
}