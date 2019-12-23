package char2_4;

interface A{
    public static final String MSG = "hello";//全局常量
    public abstract void print();//抽象方法
}
interface B{
    public abstract void get();
}

abstract class C_14{
    public abstract void print();
        }
class X extends C_14 implements A,B{//同时使用继承和接口的时候，先使用extends再使用implements
    public void print(){
        System.out.println("hello print");
    }
    public void get(){
        System.out.println("hello get");
    }
}


public class _14 {
    public static void main(String args[]){
        X x = new X();
        x.print();
    }
}
