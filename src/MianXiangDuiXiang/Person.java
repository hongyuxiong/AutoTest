package MianXiangDuiXiang;

public class Person {
    String name;
    int age;
    /**
     * sex:1 表示男性
     * sex:2 表示女性
     */
    int sex;

    public void study(){
        System.out.println("Studying");
    }
    public void age(){
        System.out.println("age"+age);
    }
    public  int addage(int i){
        age +=i;
        return age;
    }
}
