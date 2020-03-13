package heima;
//可变参数
public class day2020_3_13_1 {
    public static void main(String[] args) {
        System.out.println(add(1,2,3,4,5));
    }

    public static int add(int...arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
