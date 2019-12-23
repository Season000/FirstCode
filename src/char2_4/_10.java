package char2_4;
//多态性
class A_10{
    public void print(){
        System.out.println("A.public void print");
    }
}

class B_10 extends A_10{
    public void print(){
        System.out.println("B.public void print");
    }
    public void funB(){
        System.out.println("B.扩充方法funB()");
    }
}

class C_10 extends A_10{
    public void print(){
        System.out.println("C.public void print");
    }
}

public class _10 {
    public static void main(String args[]){
        A_10 a1 = new B_10();//对象的向上转型，实现参数的统一
        a1.print();
        A_10 a2 = new C_10();
        a2.print();         //只要是A_10的子类，都可以用A_10接受

        B_10 b = (B_10) a1;//对象的向下转型，父类要调用子类特殊的方法
        b.print();

        A_10 a3 = new B_10();
        B_10 b1 = (B_10) a3;
        b1.funB();
        System.out.println(b1 instanceof A_10);
    }
}
