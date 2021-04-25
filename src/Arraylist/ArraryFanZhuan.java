package Arraylist;

public class ArraryFanZhuan {
    public static void main(String[] args){
        String[] arr= new String[]{"AA","BB","CC","DD","FF",};
        String[] arr1= new String[arr.length];
        System.out.println(arr[0]);
        //方法一
        for(int i=0;i<arr.length;i++){
           String temp =arr[i];
           //第一位是0
           arr[i]=arr[arr.length-i-1];
           arr[arr.length-i-1]=temp;
        }
    }
}
