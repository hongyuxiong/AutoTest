package MianXiangDuiXiang;

import Jiegou.Scanner1;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入圆的半径");
        double r = scan.nextDouble();

        circle c1 = new circle();
        System.out.println("c1的面积是"+c1.findarea(r));
    }
}

class circle{
    double r;
    public double findarea(double r){
        double area = 3.14 * r * r;
        return area;
    }
}