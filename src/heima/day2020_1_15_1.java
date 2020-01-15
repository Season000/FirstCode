package heima;
//抽象
 abstract class Animal{
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public abstract void eat();
}
//南邮信息办老师qq：46561099
class Dog extends Animal{
     Dog(){
         this.setName("dog");
     }

    @Override
    public void eat() {
        System.out.println("dog eat dog's food");
    }
}
public class day2020_1_15_1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.eat();
    }
}
