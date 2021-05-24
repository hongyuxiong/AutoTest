package Jiegou;

public class ForQianTao {
    public static void main(String[] args){
        for(int h=0;h<=4;h++) {
            for (int i = 0; i <= h; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------");
        for(int j=0;j<=4;j++){
            for (int i = 0; i<= 5-j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
