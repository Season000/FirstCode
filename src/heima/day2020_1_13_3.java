package heima;
import java.util.Random;
import java.util.Scanner;
//随机数练习
//根据int变量n的值，随机获取1，n范围内的随机数
public class day2020_1_13_3 {
    public static void main(String args[]){
        int n = new Scanner(System.in).nextInt();
        Random r = new Random();
        int [] array = new int [20];
        for (int i = 0 ; i < 20 ; i ++){
            array[i] = r.nextInt(n+1);//0~n闭区间
        }
        for(int i = 0 ; i < 20 ; i ++){
            System.out.print(array[i] + "  ");
        }
    }
}
