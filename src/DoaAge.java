//狗的前2岁相当于人的10.5岁， 每增大一岁相当于人增加4岁
import java.util.Scanner;
public class DoaAge {
    public static void main (String[] args){

         Scanner scan = new Scanner(System.in);
         System.out.println("请输入狗的年龄：");
         int dogage = scan.nextInt();

         if (dogage>0 &&dogage <=2){
             System.out.println("狗的年龄是"+dogage*10.5);
         }else if(dogage >2){
             //((dogage-2)*4)+(2*10.5)  将这个算式作为一个字符串和文字相加，如果不加最外层的括号结果就会变成421
             System.out.println("狗的年龄是"+(((dogage-2)*4)+(2*10.5)));
         }else{
             System.out.println("年龄非法");
         }

    }
}
