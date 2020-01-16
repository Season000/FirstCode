package heima;
//向上转型一定是安全的
//对象的向下转型是一个【还原】的动作
//格式：子类名称 子类对象 = （子类名称）父类对象    有点类似于强制类型转换
class day1_15_animal{
    public void fun1(){
        System.out.println("animal--fun1");
    }
}

class day1_15_cat extends day1_15_animal{
    public void fun1(){
        System.out.println("cat--fun1");
    }
    public void fun2(){
        System.out.println("cat--fun2");
    }
}

public class day2020_1_15_5 {
    public static void main(String[] args) {
        day1_15_animal animal1 = new day1_15_cat();
//        animal1.fun2();   //报错，父类animal中没有fun2
        day1_15_cat cat1 = (day1_15_cat)animal1;
        cat1.fun1();
        cat1.fun2();//向下转型后可以调用子类方法
    }
}
