package Arraylist;

public class YiWeiArray {
    public static void main(String[] args){

        /**静态初始化*/
        int [] ids = new int[]{1001,1002,1003,1004};
        /**String型的数组的动态初始化*/
        String[] names = new String[5];
        //总结:数组一旦初始化完成，其长度就确定了。
        /**2.如何调用数组的指定位置的元素:通过角标的方式调用。*/
        /**数组的角标（或索引）从日开始的，到数组的长度-1结束。*/
        names[0] ="王铭";
        names[1] ="王赫";
        names[2] ="张学良"; 
        names[3] ="孙居龙";
        names[4] ="王宏志";
        System.out.println(names.length);
        System.out.println(ids.length);

        /**遍历数组,范围就是数组的长度*/
        for(int i= 0;i < names.length;i++){
            System.out.println(names[i]);
        }
    }

}
