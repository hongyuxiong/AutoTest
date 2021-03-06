/**打印10--99的随机数*/
    public class SuiJiShu {
    public static void main(String[] args){
        /*
        [0.0,1.0) -->[0.0,90.0)--->[10.0,100.0)-->[10,99]
        99是 因为 100.0是double型，开区间到不了100.0，只有99.x,强转以后变成99
                */
        int value = (int)(Math.random()* 90+10);


        System.out.println(value);
    }
}

