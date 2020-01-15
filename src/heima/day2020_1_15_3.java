package heima;
//接口
/*
* 在任何一个java版本中，接口都能定义抽象方法
* public abstract 返回值类型 方法名称（参数列表）  不能写方法体！
*
* */
public interface day2020_1_15_3 {
    public abstract void fun1();
    public abstract void fun2();
    public static final int NUM = 10;
}

class day2020_1_15_3_1 implements day2020_1_15_3{
    @Override
    public void fun1(){
        System.out.println("this is fun1");
    }

    @Override
    public void fun2() {
        System.out.println("this is fun2");
        System.out.println(day2020_1_15_3.NUM);
    }
}