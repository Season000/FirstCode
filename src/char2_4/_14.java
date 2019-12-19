package char2_4;

interface A{
    public static final String MSG = "hello";//全局常量
    public abstract void print();//抽象方法
}
interface B{
    public abstract void get();
}
class X implements A,B{
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
