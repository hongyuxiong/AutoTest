package MianXiangDuiXiang;

import Jiegou.Scanner1;

import java.util.Scanner;

//打印一个长方形的面积
public class Rectangle  {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入长");
        int m = scan.nextInt();
        System.out.println("请输入宽");
        int n = scan.nextInt();
        RectangleArea r1 = new RectangleArea();
        System.out.println("面积是"+r1.area(m,n));
    }
}

class RectangleArea{
    int m;
    int n;
    public int area(int m, int n){
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return  m * n;
    }
        }