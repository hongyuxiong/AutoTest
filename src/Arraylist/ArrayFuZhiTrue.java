package Arraylist;

public class ArrayFuZhiTrue {
    public static void main(String[] args){
        int[] array1,array2;
        array1 = new int[]{2,3,5,7,11,13,17,19};
        System.out.println(array1[2]+" ");
        System.out.println("array1的数组");

        //显示array1的内容
        for(int i=0;i<array1.length;i++){

            System.out.print(array1[i]+" ");
        }
        System.out.println();
        // 将array数组中的元素赋值给array2数组。
        array2 = new int[array1.length];
        for(int i = 0;i<array2.length;i++){
                array2[i]=array1[i];
                for(int j = 0;j<array2.length;j++){
                    if(j%2 == 0){
                        array2[j]=j;
                    }
                }
        }
        System.out.println("array2的数组");
        for(int i=0;i<array2.length;i++){
            System.out.print(array2[i]+" ");

        }
        System.out.println();
        System.out.println("array1的数组");
        //这里还是 需要遍历一次数组再打印才能看到值
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+" ");
        }
    }
}
