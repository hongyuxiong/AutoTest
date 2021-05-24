package Jiegou;//switch条件中只能放 byte，short，char，int，枚举类型，String类型，不可以放 boolean类型

import java.util.Scanner;
public class Switch1 {
    public static void main(String[] args){
       Scanner scan =new Scanner(System.in);
       System.out.println("请输入季节：");
        String season = scan.next();
        switch (season){
            //case之后只能声明常量，不能声明范围，也就是Boolean型，和switch条件一样不能加入Boolean型
            case "spring":
                System.out.println("春暖花开");
                break;
            case "summer":
                System.out.println("夏日炎炎");
                break;
            case "autumn" :
                System.out.println("秋高气爽");
                //break不是一定要加的。但绝大多数时候都要加
                break;
            case "winter":
                System.out.println("冬雪皑皑");
                break;
            //default:相当于if-else结构中的else.
            default:
                System.out.println("季节输入有误");
                break;
                //最后default的break是默认有的，最后没有case了，加不加都行。
        }

    }
}
