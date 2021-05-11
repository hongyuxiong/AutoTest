package Arraylist;

public class ArraryFindTwo  {
    public static void main(String[] args){
        /**
         * 二分法查找
         * 前提：所要查找的数组必须有序
         */
        int[] arr2 = new int[]{-98,-23,-2,3,4,56,78,90};
        int dest1 = -98;
        int head = 0;//第一个索引
        int end= arr2.length - 1;//最后一个索引
        boolean isFlag = true;
            //默认条件为真 true
        while(head<=end){
            //找到middle的索引
            int middle = (head + end)/2;

            if(dest1 == arr2[middle]){
                System.out.println("找到了，位置为第"+ middle+"位");
                isFlag=false;
                break;
            }else if(arr2[middle]>dest1){
                end = middle -1;
            }else{  //arr2[middle]<dest1
                head = middle +1;
            }
            }
           //while循环不满足条件，isFlag为true
            if(isFlag){
                System.out.println("没找到");
            }
        }
    }

