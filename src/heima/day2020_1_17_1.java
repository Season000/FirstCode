package heima;
//内部类的使用
/*
* 内部类分成员内部类和方法内部类
* 成员内部类就是在类里面直接定义
* 方法内部类是在类中的方法中定义一个新的类
* */
class  day2020_1_17_1_waibu{//外部类
        public class day2020_1_17_1_neibu{//内部类
            public void fun2(){
                System.out.println("内部类fun2");
            }
            public void fun3(){
                System.out.println(str);
            }
        }

        String str = "string1";

        public void fun1(){
            System.out.println("外部类fun1");
        }

        public void useNei(){
            System.out.print("调用内部类的fun2方法：");
            new day2020_1_17_1_neibu().fun2();
        }
    }
public class day2020_1_17_1{
    public static void main(String[] args) {
        day2020_1_17_1_waibu one = new day2020_1_17_1_waibu();
        System.out.println("间接访问：");
        one.new day2020_1_17_1_neibu().fun2();
        System.out.println("=============");
        one.useNei();
        System.out.println("===========");

        System.out.println("直接访问:");
        //外部类.内部类 对象名 = new 外部类().new 内部类()；
        day2020_1_17_1_waibu.day2020_1_17_1_neibu two =
            new day2020_1_17_1_waibu().new day2020_1_17_1_neibu();
        two.fun2();
        two.fun3();
    }
}
