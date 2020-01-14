package heima;
//java.lang.Math是数学相关工具类
/*
* public static double abs(double num)绝对值
* public static double ceil(double num)向上取整
* public static double floor(double num)向下取整
* public static long round(double num)四舍五入
* */
public class day2020_1_14_3 {
    public static void main(String[] args) {
        //abs
        int a = -33;
        System.out.println(Math.abs(a));//33

        //ceil
        System.out.println(Math.ceil(3.2));//4.0

        //floor
        System.out.println(Math.floor(3.2));//3.0

        //round
        System.out.println(Math.round(3.2));//3
        System.out.println(Math.round(3.5));//4

    }
}
