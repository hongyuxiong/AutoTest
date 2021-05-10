package Arraylist;

public class ArraryFind {
    public static void main(String[] args) {
        String[] arr = new String[]{"AA", "BB", "CC", "DD", "FF",};
        //线性查找
        String dest = "GG";
        boolean ifFlag = true;
         for(int i = 0;i <arr.length;i++){
             if(dest.equals(arr[i])){
                 System.out.println("找到了，位置是"+i);
                 ifFlag=false;
                 break;//找到了就退出
             }
         }
        /**
         * 意思就是如果找到了，置为false，那么也就进不到下面的判断，也就不会打印找到了有同时打印没有找到。
         */
        //if(ifFlag)  默认认为ifFlag为真，也就是true
         if(ifFlag){
             System.out.println("很遗憾没有找到");
         }

    }
}
