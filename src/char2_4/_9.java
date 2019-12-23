package char2_4;
//final关键字

final class A_9{//不能有子类了

}

//class B extends A_9{//错误写法，A类不可被继承了
//
//}


//使用final定义的方法，不能被子类所覆写
class B_9{
    public final double GOOD = 100;//final定义的变量不能够被修改，即成为一个常量，常量名称要求用大写字母表示
    public final void fun(){
        System.out.println("这是一个final方法");//此方法不能被子类覆写
    }
}
class C_9 extends B_9{
//    public void fun(){         //这是错误的，fun（）不能被覆写
//
//    }
}

//public static final String MSG = "MLDN"     定义全局常量字符串

public class _9 {
    public static void main(String args[]){
        System.out.println("_9");
    }
}
