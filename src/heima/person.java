package heima;

public class person {
    private String name;
    private int age;

    person(){

    }
    person(String name){
        this.name = name;
    }
    person(String name , int age){
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
