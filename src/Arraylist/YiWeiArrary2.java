package Arraylist;

public class YiWeiArrary2 {
    public static void main(String[] args){
        /**byte short int long的数组初始值都是0*/
        int[] arr = new int[1];
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        /**char型的数组的初始值是0，不是'0'*/
        char[] arr1 = new char[1];
        for(int i=0;i<arr.length;i++){
            System.out.println("实际上是0--"+arr[i]+"--前后没字就会不显示");
        }
        /**布尔型的初始值是false*/
        boolean[] arr2 = new boolean[1];
        for(int i=0;i<arr.length;i++){
            /**打印角标/索引为0的数组的值*/
            System.out.println(arr2[0]);
        }
        /**引用数据类型的初始值是 null */
        String[] arr3 = new String[5];
        System.out.println(arr3[0]);
        if(arr3[0]==null){
            System.out.println("的确是null");
        }
    }
}
