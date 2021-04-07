package Arraylist;

import java.util.Scanner;

/**
 * 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
 * 成绩>=最高分-10等级为‘A'
 * 成绩>=最高分-20等级为'B'
 * 成绩>=最高分-30等级为'C'
 * 其余等级为'D'
 *
 * 提示:先读入学生人数，根据人数创建int数组，存放学生成绩。
 */
public class YiWeiArrary3 {
    public static void main(String[] args){
        /**.使用Scanner，读取学生个数*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生人数");
        int number = scanner.nextInt();
        /**2.创建数组，存储学生成绩:动态初始化*/
        /**存储了若干个分数 */
        int[] scores = new int[number];
        /**3. 遍历数组的元素*/
        System.out.println("请输入"+ number+"个学生成绩");
        for(int i =0;i< scores.length;i++){

            /** scores[i]用来表示顺序,给数组中的元素赋值*/

            scores[i] = scanner.nextInt();
        }
        /**4.获取数组中的元素的最大值:最高分*/
        int maxscore = 0;
        for(int i = 0; i < scores.length;i++){
            if(maxscore < scores[i]){
                maxscore=scores[i];

            }
    }
        System.out.println("最高分是"+maxscore);

        /**5.根据每个学生成绩与最高分的差值，得到每个学生的等级，并输出等级和成绩*/
        char level;
        for(int i=0;i<scores.length;i++){
            if(maxscore - scores[i] <=10){
                level='A';
            }else if(maxscore - scores[i] <=20) {
                level = 'B';
            }else if(maxscore - scores[i] <=30) {
                level = 'c';
            }else{
                    level ='D';
                }

            /** scores{i}是某个学生的分数，第几个分数的length也表示了第几个学生，用i表示学生序号是正确的。*/

            System.out.println("学生"+i+"成绩是"+scores[i]+"等级是"+level);
            }
        }
    }

