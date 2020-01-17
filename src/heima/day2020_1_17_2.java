package heima;
//内部类中出现重名的情况处理方法

class day2020_1_17_2_outer{
    private int num = 10;
    class day2020_1_17_2_inner{
        private int num = 20;
        public void fun1(){
            int num = 30;
            System.out.println(num);//30
            System.out.println(this.num);//20

            System.out.println(day2020_1_17_2_outer.this.num);//10

        }
    }
}
public class day2020_1_17_2 {
    public static void main(String[] args) {
        day2020_1_17_2_outer.day2020_1_17_2_inner one = new day2020_1_17_2_outer().new day2020_1_17_2_inner();
        one.fun1();
    }
}
