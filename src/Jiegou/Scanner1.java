package Jiegou;//Scanner类的运用
// 整体代码还没有加入抛异常的条件，后续加上。

/*
具体实现步骤:
1.导包:import java.util.Scanner;
2.Scanner的实例化:Scanner scan = new Scanner(System.in);
3.调用Scanner类的相关方法 next() / nextXxx()，来获取指定类型的变量
 */
import java.util.Scanner;
public class Scanner1 {
    public static void  main (String[] argsp){
        Scanner scan = new Scanner(System.in);

        //获取int型的值
        System.out.println("请输入年龄：");
        int num = scan.nextInt();
        System.out.println("您的年龄是"+num);

        //获取String型的值
        System.out.println("请输入名称：");
        String name = scan.next();
        System.out.println("我的名字叫"+name);

        //获取double型的值
        System.out.println("请输入体重：");
        double weight = scan.nextDouble();
        System.out.println("您的体重是"+weight);


        System.out.println("你是否喜欢我：true/false");
        boolean islove = scan.nextBoolean();
        System.out.println(islove);

        System.out.println("请输入你的性别：男/女");
        //对于char型的获取，Scanner没有提供相关的方法。只能获取一个字符串
        String gender = scan.next();
        //获取索引为0位置上的字符,输入男
        char genderChar = gender.charAt(0);
        System.out.println(genderChar);

    }
}

