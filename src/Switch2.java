import java.util.Scanner;

/*
打印某年某月某日是当年的第多少天
 */
public class Switch2 {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("请输入年");
        int year = scan.nextInt();
        System.out.println("请输入月");
        int month = scan.nextInt();
        System.out.println("请输入日");
        int day = scan.nextInt();

        int sumdays=0;
        switch (month){
            case 12:
                sumdays +=31;
            case 11:
                sumdays +=30;
            case 10:
                sumdays +=31;
            case 9:
                sumdays +=30;
            case 8:
                sumdays +=31;
            case 7:
                sumdays +=31;
            case 6:
                sumdays +=30;
            case 5:
                sumdays +=31;
            case 4:
                sumdays +=30;
            case 3:
                sumdays +=31;
            case 2:
                /**闰年公式*/
                if(year %4==0 &&year %100 !=0 ||year % 400==0){
                    sumdays +=29;
                }else{
                sumdays +=28;}
            case 1:
                sumdays +=day;
        }
        System.out.println(year+"年"+month+"月"+day+"日"+"是当年的第"+sumdays+"天");
    }
}
