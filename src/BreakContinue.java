public class BreakContinue {
    public static  void main(String[] args){
        for(int i=1;i<=10;i++){
            if(i % 4 ==0){
                break;

            }
            System.out.print(i);
        }
        System.out.print("\n");
        for(int i=1;i<=10;i++){
            if(i % 4 ==0){
                continue;
            }
            System.out.print(i+"哦");
        }
        System.out.print("\n");
        for(int j=1;j<=4;j++){
        for(int i=1;i<=10;i++){
            if(i % 4 ==0){
                /**跳出当次循环*/
                continue;
            }
            System.out.print(i);
        }
        }

        for(int j=1;j<=4;j++){
            for(int i=1;i<=10;i++){
                if(i % 4 ==0){
                    /**跳出当前最近的一层循环*/
                    break;
                }
                System.out.print(i+"拜拜");
            }
            System.out.println();
        }
        System.out.println("------------");
       label:for(int j=1;j<=4;j++){
            for(int i=1;i<=10;i++){
                if(i % 4 ==0){
                    /**跳出指定标识的一层循环,此处是最外层，所以只执行了一次，得出结果123*/
                    break label;
                }
                System.out.print(i);
            }
        }System.out.println("\n");

        label:for(int j=1;j<=4;j++){
            for(int i=1;i<=10;i++){
                if(i % 4 ==0){
                    /**结束指定标识的一次循环,此处是最外层，所以只结束了一次，得出结果四次 123*/
                    continue label;
                }
                System.out.print(i);
            }
        }



    }
}
