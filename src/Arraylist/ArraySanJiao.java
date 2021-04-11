package Arraylist;
/**
 *
 *
 *打印一个10行的杨辉三角
 *1.第一行有1 个元素，第n行有n个元素
 *2.每一行的第一个元素和最后一个元素都是1
 *3.从第三行开始，对于非第一个元素和最后一个元素的元素。即:
 * yanghui[i][j]= yanghui[i-1][j-1] + yanghui[i-1][j];
 *
 *
 * 运行起来不行，再找找更好的答案
 * */
public class  ArraySanJiao {
    public static void main(String[] args){
        //声明一个数组
        int [][] yangHui = new int [10][];

        //给数组的元素赋值
        for(int i = 0;i<yangHui.length;i++){
            yangHui[i]=new int[i + 1];
            //给首尾元素赋值
            yangHui[i][0]=yangHui[i][i]=1;
            //给每行的非首尾元素赋值
            if(i>1){
                for (int j = 1;j<yangHui[i].length-1;j++){
                    yangHui[i][j]= yangHui[i-1 ][j-1] + yangHui[i-1][j];
                }
            }
        }



        //遍历二维数组
        for(int i= 0;i<yangHui.length;i++){
            for (int j = 0;j<yangHui[i].length;j++){
                System.out.println(yangHui[i][j]+" ");
            }
        }
    }
}
