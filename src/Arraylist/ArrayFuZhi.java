package Arraylist;

public class ArrayFuZhi {
    public static void main(String[] args){
        int[] array1,array2;
        array1 = new int[]{2,3,5,7,11,13,17,19};

        //显示array1的内容
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        // 将array1的值赋值给array2，实际上是在array1的地址值上复制了array2，所以array1和array2在内存空间上是同一块数据。
        array2=array1;
        System.out.println("array1的地址值"+array1);
        System.out.println("array2的地址值"+array2);
        for(int i = 0;i<array2.length;i++){
            if(i%2==0){
                array2[i]=i;
            }
        }
        System.out.println();
        //显示array1的内容,因为array1和array2都指向同一个地址值，
        //所以修改了array2，也等于修改了array1的值。
        //这里还是 需要遍历一次数组再打印才能看到值
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+" ");
        }
    }
}
