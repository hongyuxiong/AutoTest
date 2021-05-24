package Jiegou;

import java.util.Scanner;
/**水仙花数是个十百位 立方和=其本身  153=1*1*1+3*3*3+5*5*5.  531虽然数字相同，但和不等于531*/
public class ShuiXianHuaShu {

    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            /*
            Scanner scan =new Scanner(System.in);
            System.out.println("输入");
            int i =scan.nextInt();*/

            /**取出这个三位数的百位数*/
            int a = i / 100;
            /*取出这个三位数的十位数*/
            int b = (i / 10) % 10;
            /**取出这个三位数的个位数*/
            int c = i % 10;

            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.println(i);
            }
        }
    }
}



