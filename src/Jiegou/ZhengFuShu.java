package Jiegou;

import java.util.Scanner;
/*
输入任意个数字，统计正数和负数的个数，数字为0 时不统计直接退出
 */
public class ZhengFuShu {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int zheng =0;
        int fu = 0;
        System.out.println("请输入数字");
        /**while(true) 表示一直执行，直到break结束循环,一般来说会设置一个条件控制次数 */
        while(true){

            int number = scan.nextInt();
            if(number>0){
                zheng++;
            }else if(number<0){
                fu++;
            }else{
                break;
            }
        }
        System.out.println("正个数是"+zheng+"负数个数是"+fu);
    }
}

