package MianXiangDuiXiang;

public class PersonTest {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.name = "Tom";
        p1.age = 18;
        p1.sex = 1;

        p1.study();
        p1.age();
       int newAge = p1.addage(2);
       System.out.println("Tom的新年龄"+newAge);

       //********************

        Person p2 = new Person();
        p2.age();
        int newP2age = p2.addage(10);
        p2.age();
        System.out.println("Tom的新年龄"+newP2age);
    }
}
