package Arraylist;

public class ArraryFanZhuan {
    public static void main(String[] args){
        String[] arr= new String[]{"AA","BB","CC","DD","FF",};
        String[] arr1= new String[arr.length];
        System.out.println("输出第一位索引:");
        System.out.println(arr[0]);
        /**
         * 方法一
         */

        for(int i=0;i<arr.length/2;i++){
           String temp =arr[i];
           //第一位是0
           arr[i]=arr[arr.length-i-1];
           arr[arr.length-i-1]=temp;

        }
        System.out.println("输出反转后的数组:");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }

        /**
         * 方法2：
         * 因为i的索引被定义为0，整体的长度为5。表示j是第5个长度，实际上索引位置是4，表示最后一个索引需要用整体的长度减1
         * 但如果，i=1,那么j的所在位置就要减2
         */
        for(int i=0,j = arr.length-1;i<j;i++,j--){
            String temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        System.out.println();
        System.out.println("将反转后的数组再次反转:");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
    }
}
}
