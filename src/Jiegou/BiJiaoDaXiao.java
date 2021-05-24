package Jiegou;//比较三个数的大小并按从小到大的顺序排列

import java.util.Scanner;

/**@author 111*/
public class BiJiaoDaXiao {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int num1 = scan.nextInt();
        System.out.println("请输入第2个整数");
        int num2 = scan.nextInt();
        System.out.println("请输入第3个整数");
        int num3 = scan.nextInt();

        if(num1>num2){
            //比大的还大
            if(num3>num1){
                System.out.println(num2+","+num1+","+num3);
                //比小的还小
            }else if(num3<num2){
                System.out.println(num3+","+num2+","+num1);
            }else {
                System.out.println(num2 + "," + num3 + "," + num1);
            }
        }else {
            // num1<num2
            //比大的还大
            if(num3>num2){
                System.out.println(num1+","+num2+","+num3);

            }else if(num3<num1){
                System.out.println(num3+","+num1+","+num2);
            }else {
                System.out.println(num1 + "," + num3 + "," + num2);
            }
        }
    }
}
