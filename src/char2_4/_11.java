package char2_4;
//抽象类的语法定义，使用限制，实际应用

//abstract class A_11{//定义一个抽象类，无法实例化
//    public void fun(){
//        System.out.println("存在有方法体的方法");
//    }
//    public abstract void print();
//}
//
//class B_11 extends A_11{
//    public void print(){
//        System.out.println("this is B_11 print()");
//    }
//}
//
//public class _11 {
//    public static void main(String args[]){
//    B_11 b1 = new B_11();
//    b1.print();
//    b1.fun();
//    }
//}
abstract class A_11{
    public A_11(){
        this.print();
    }

    public abstract void print();
}

class B_11 extends A_11{
    private int num = 100;
    public B_11(int num){
        this.num = num;
    }
    public void print(){
        System.out.println("num = " + num);
    }
}
public class _11 {
    public static void main(String args[]){
        new B_11(30);
    }

}
