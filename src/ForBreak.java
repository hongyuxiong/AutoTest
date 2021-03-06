import java.util.Scanner;

public class ForBreak {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int m =scan.nextInt();
        System.out.println("请输入第二个整数：");
        int n =scan.nextInt();
        int min=(m>n)?m:n;
        for(int i =min;i>=1;i--){
            if(m %i==0&&n %i==0){
                System.out.println("最大公约数为"+i);
                /**一旦找到一个数就跳出循环*/
                break;
            }
        }
        int max=(m>n)?m:n;
        for(int i =max;i>=1;i++){
            if(i%m ==0&&i%n==0){
                System.out.println("最小公倍数为"+i);
                break;
            }
        }
    }
}
