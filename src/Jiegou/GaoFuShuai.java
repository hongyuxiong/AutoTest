package Jiegou;/*
身高大于180，财富大于1千万，要帅
 */
import java.util.Scanner;
public class GaoFuShuai {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的身高");
        int height = scan.nextInt();
        System.out.println("请输入你的财富");
        double wealth = scan.nextDouble();

        /*
         System.out.println("请输入是否帅 true/false");
        boolean handsome = scan.nextBoolean();
          //三个条件都要满足，handsome默认true
        if(height >= 180 && wealth>1 &&handsome){
            System.out.println("一定要嫁");
            //有一个满足就行
        }else if(height >=180 ||wealth>1||handsome){
            System.out.println("也行吧");
        }else{
            //全都不满足
            System.out.println("算了");
        }
        */

        System.out.println("请输入是否帅 是/否");
        String handsome = scan.next();
                if(height >= 180 && wealth>1 && "是".equals(handsome)){
            System.out.println("一定要嫁");
            //有一个满足就行
        }else if(height >=180 ||wealth>1|| "是".equals(handsome)){
            System.out.println("也行吧");
        }else{
            //全都不满足
            System.out.println("算了");
        }


    }
}
