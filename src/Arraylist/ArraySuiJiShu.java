package Arraylist;
//求 10个两位的随机数的最大值，最小值，综合平均数
public class ArraySuiJiShu {
    public static void main(String[] args)
{
        int[] arr = new int[10];
        for(int i =0 ;i<arr.length;i++){
        arr[i]=(int)(Math.random() *(99 -10 +1)+10);
        }
        //  求数组中元素最大值
        int maxValue = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(maxValue <arr[i]){
                maxValue = arr[i];
            }
        }
        System.out.println("最大值为" + maxValue);
    //遍历数组
    for(int i = 1;i<arr.length;i++){
        System.out.print(arr[i]+"  ");
    }
        System.out.println();
    //  求数组中元素最小值
       int minValue = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(minValue > arr[i]){
                minValue = arr[i];
            }
        }
        System.out.println("最小值为" + minValue);
    //  求数组中元素的和
    int sum = 0;
        for(int i = 1;i<arr.length;i++){
          sum+=arr[i];
             }
    System.out.println("和是"+sum);
    //  求数组平均数
    int avg =sum/arr.length;
        System.out.println("平均数是"+avg);
}
         }



