public class ForOuShu {
    public static void main(String[] args){
        int sum = 0;  /**所有偶数的和*/
        int count = 0;/**偶数个数*/
        for(int i=1; i<=100;i++){
            if(i %2==0){
            sum +=i;
            count++;
            }
        }
        System.out.println("所有偶数的和是"+sum);
        System.out.println("偶数的个数是"+count);
    }
}
