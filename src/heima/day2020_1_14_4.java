package heima;
//练习题：计算在-10.8到5.9之间，绝对值大于6，或者小于2.1的整数有多少？
public class day2020_1_14_4 {
    public static void main(String[] args) {
        double low = Math.ceil(-10.8);
        System.out.println("the low num is:" + low);
        double high = Math.floor(5.9);
        System.out.println("the high num is:" + high);
        int count = 0;//计算有多少个数
        for (double i = low; i <=high ; i++) {
            if(Math.abs(i)>6 || Math.abs(i)<2.1){
                count++;
            }
        }
        System.out.println("the count is:" + count);
    }
}
