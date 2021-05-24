package Jiegou;

public class SanWeiWhu {
    public static void main(String[] args){
        int a = 152;
        int geWei = a % 10;
        int shiWei = (a/10)%10;
        int baiWei = a/100;
        System.out.println("个位是"+ geWei +"十位是"+ shiWei +"百位是"+baiWei);
    }
}
