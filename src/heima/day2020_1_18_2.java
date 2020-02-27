package heima;
//匿名内部类
//如果接口的实现类（或者是父类的子类）只需要使用唯一一次
//那么这种情况下就可以省略掉该类的定义，而改为使用 【匿名内部类】

//定义格式：
// 对象名 = new 接口名称（）{
//  覆盖重写所有抽象方法
// };

interface day2020_1_18_2_interface{
    public void fun1();
}
class day2020_1_18_2_myinterface implements day2020_1_18_2_interface{

    @Override
    public void fun1() {
        System.out.println("实现类的fun1覆盖重写！");
    }
}
public class day2020_1_18_2 {
    public static void main(String[] args) {
        day2020_1_18_2_interface obj = new day2020_1_18_2_interface() {
            @Override
            public void fun1() {
                System.out.println("匿名重写了接口的抽象方法");
            }
        };
        obj.fun1();
    }
}
