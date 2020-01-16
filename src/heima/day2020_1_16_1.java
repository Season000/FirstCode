package heima;
//Instanceof的用法
//用法：  对象 instanceof 类型  得到一个Boolean值，是此类型得到一个true
class day2020_1_16_1_animal{
    public void fun1(){
        System.out.println("animal--fun1");
    }
}

class day2020_1_16_1_cat extends day2020_1_16_1_animal{
    public void fun1(){
        System.out.println("cat--fun1");
    }
    public void fun2(){
        System.out.println("cat--fun2");
    }
}
public class day2020_1_16_1 {
    public static void main(String[] args) {
        day2020_1_16_1_animal animal = new day2020_1_16_1_cat();
        animal.fun1();
        System.out.println(animal instanceof day2020_1_16_1_animal);
        System.out.println(animal instanceof day2020_1_16_1_cat);

    }
}
