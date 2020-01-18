package heima;
//局部内部类：一个类定义在一个方法内部
//只有当前所属的方法才可以使用它，出了这个方法外面就不能用了。
/*
* 定义格式：
* 修饰符 class 外部类名称{
*   修饰符 返回值类型，外部类的方法名称（参数列表）{
*       class 局部内部类名称{
*              …………
*       }
*   }
* }
* */

//局部内部类中的局部变量需要是“有效final的”，就是不能改变
class day2020_1_18_1_Outer{
    public void methodOuter(){
        class Inner{
            int num = 10;
            public void methodInner(){
                System.out.println(num);//10
            }
        }
        Inner innerone = new Inner();
        innerone.methodInner();
    }
}
public class day2020_1_18_1 {
    public static void main(String[] args) {
        day2020_1_18_1_Outer one = new day2020_1_18_1_Outer();
        one.methodOuter();
    }
}
