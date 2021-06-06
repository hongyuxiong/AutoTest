package MianXiangDuiXiang;
/*
*
*  定义一个类 Student，包含三个属性，学号 number ，年级 state，成绩score
*  创建20个学生对象，学号1到20，年级和成绩都有随机数指定
*
*  打印出3年级的学生信息
*  使用冒泡排序使学生成绩排序，并且遍历所有学生信息
*
*  生成随机数 Math.random().返回 double
*  四舍五入取整，  Math.round(double d),返回值类型 long
*
*
*/

public class StudentTest {

    public static void main(String[] args){

        //声明Student类型的数组
        Student[] stu = new Student[20];
        //遍历学生数组并赋随机值
        for(int i = 0; i<stu.length;i++){
            //给数组元素赋值
            stu[i] = new Student();
            //给student的对象属性赋值
            stu[i].number = (i+1);
            //年级 [1,6],用 int来强转就是截断的作用，比如 2.9也是2
            stu[i].state = (int)(Math.random() *(6-1+1));
            //成绩[0,100]
            stu[i].score = (int)(Math.random() *(100-0+1));
        }
        for(int i = 0;i<stu.length;i++){
         System.out.println(stu[i].info());
        }
        System.out.println("***************");
        for(int i = 0;i<stu.length;i++){
            if(stu[i].state ==3){
                System.out.println(stu[i].info());
            }
        }

        for(int i =0;i <stu.length - 1;i++){
            for(int j =0;j <stu.length - 1 - i;j++){
                if(stu[j].score > stu[j+1].score){
                    //声明一个临时变量，用来对学生的学号进行排序
                    Student temp = stu[j];
                    stu[j] = stu[j+1];
                    stu[j+1] = temp;
                }
            }
        }
    }
}



class Student{
    int number;//学号
    int state;//年级
    int score;//成绩

    //显示学生信息的方法
    public String info(){
        return  "学号"+ number + "，年级： " +state + " ，成绩"+score;
    }




}