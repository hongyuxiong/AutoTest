package Jiegou;

public class ZhiShu {
    public static void main(String[] args){
        //获取当前时间距离1970-01-01 00:00:00的毫秒数

        long start =System.currentTimeMillis();
        int  count = 0;
        label:for(int i=1;i<=100000;i++){
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i % j==0){
                    continue label;
                }
            }
            count++;
        }
        long end = System.currentTimeMillis();
        System.out.println("质数个数为："+count);
        System.out.println("花费的时间为"+(end - start));
    }

}
