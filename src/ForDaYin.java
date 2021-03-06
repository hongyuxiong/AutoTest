public class ForDaYin {
    public static void main(String[] args){
        for(int i=1;i<=150;i++){
            /* i后面+ “ ”表示空格，多个if条件满足的就打印，不满足的就不打印，
                循环一遍后换行一次。
                1.编写程序从1循环到150，并在每行打印一个值,3另外在每个3的倍数行上打印出“foo”,
                2.在每个5的倍数行上打印“biz”,
                3.在每个7的倍数行上打印输出“baz”。
             */
            System.out.println(i+" ");
            if(i %3==0){
                System.out.print("foo");
            }
            if(i %5==0){
                System.out.print("biz");
            }
            if(i% 7 == 0){
                System.out.print("baz");
            }
            System.out.println();
        }
    }
}
