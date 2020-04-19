package heima;
class A {

    static{
        System.out.print(1);
    }
    public A(){
        System.out.print(2);
    }
}

class B extends A{

    static{
        System.out.print("a");
    }
    public B(){
        System.out.print("b");
    }
    public void print(){
        System.out.println("print methed");
    }
}
public class day2020_3_19_1 {
    public static void main(String[] args) {
//        B temp = new B();
        B temp1 = new B();
        System.out.println("============");
        temp1 = new B();
        System.out.println("============");
        temp1.print();
    }
}
