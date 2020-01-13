package heima;
import java.util.Scanner;
//匿名函数

public class day2020_1_13_2 {
    public static void main(String args[]){

        System.out.println(new person("xiaoming",18).getInfo());

        //匿名使用sanner:
        int num = new Scanner(System.in).nextInt();
        System.out.println("your input num is:" + num);
    }
}
