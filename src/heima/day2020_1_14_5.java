package heima;
//继承

class day1_15_FU{
    private String name;
    private int age;

    day1_15_FU(){
        System.out.println("fu lei zhong de gou zao fang fa");
    }
    day1_15_FU(String name){
        this.name = name;
    }
    day1_15_FU(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getInfo(){
        return "the name is:" + this.name + ",and the age is:" + this.age;
    }
}

class day1_15_ZI extends day1_15_FU{
    day1_15_ZI(){
        System.out.println("zi lei zhong de gou zao fang fa");
    }
        }
public class day2020_1_14_5 {
    public static void main(String[] args) {
        day1_15_ZI zi = new day1_15_ZI();
        zi.setName("xiaoming");
        zi.setAge(18);
        System.out.println(zi.getInfo());
    }
}
