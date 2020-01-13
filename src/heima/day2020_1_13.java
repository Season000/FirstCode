package heima;
import java.util.Scanner;

public class day2020_1_13 {
    public static void main(String args[]){
        System.out.println("please input two num:");
        int a = input();
        int b = input();
        System.out.println("the sum is:" + sum(a,b));


    }
    public static int input(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }

    public static int sum(int a, int b){
        return a + b;
    }
}
