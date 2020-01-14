package heima;
//静态方法

class class2020_1_14_1{
    public static void print(){
        System.out.println("this is a static method belong to class2020_1_14_1");
    }
}
public class day2020_1_14_1 {
    public static void main(String[] args) {
//        System.out.println("1243");
        class2020_1_14_1.print();//静态方法不需要实例化，直接“类.方法名”调用
    }
}
