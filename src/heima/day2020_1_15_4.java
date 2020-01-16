package heima;
//多态性
/*
* 格式：
* 父类名称 对象名 = new 子类名称（）；
*
* 接口名称 对象名 = new 实现类名称（）；
* */
class day2020_1_15_4_fu{
    public void method(){
        System.out.println("fu lei fang fa ");
    }
}
class day2020_1_15_4_zi extends day2020_1_15_4_fu{
    public void method(){
        System.out.println("zi lei fang fa");
    }
}

public class day2020_1_15_4 {
    public static void main(String[] args) {
        day2020_1_15_4_fu zi = new day2020_1_15_4_zi();
        zi.method();
    }
}
