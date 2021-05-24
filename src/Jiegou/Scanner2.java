package Jiegou;

import java.util.Scanner;
public class Scanner2 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("请输入你的成绩：（0-100）");
    int score = scan.nextInt();

    //
    if (score >=90){
        System.out.println("奖励100块");
    }
    /*输入81也是奖励一顿好吃的，因为上一个循环没有大于90
      但如果 >=90 和 >=80互换一下的话，打印的语句就不一样了。
      一旦某个条件满足，后面的条件就不执行了。
    */
    else if (score >=80 ){
        System.out.println("奖励一顿好吃的");
    }
    else{
        System.out.println("打屁屁");
    }
    }
}
