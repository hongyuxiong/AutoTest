package Arraylist;
//求 10个两位的随机数的最大值，最小值，综合平均数
public class ArraySuiJiShu {
    public static void main(String[] args){
          int[] arr = new int[10];
          for(int i =0 ;i<arr.length;i++){
              arr[i]=(int)Math.random() *(99 -10 +1)+10;
          }
    }
}
