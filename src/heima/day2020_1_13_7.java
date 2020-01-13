package heima;

import java.util.ArrayList;

//练习题2：自定义4个学生对象，添加到集合，并遍历
class student{
    private String name;
    private int age;

    student(){

    }
    student(String name){
        this.name = name;
    }
    student(String name,int age){
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
        return "this student's name is:" + this.name + ",and the age is:" + this.age;
    }
}
public class day2020_1_13_7 {
    public static void main(String args[]){
        student stu1 = new student("xiaoming",18);
        student stu2 = new student("xiaohong",19);
        student stu3 = new student("xiaogang",20);

    ArrayList<student> stulist = new ArrayList<>();
    stulist.add(stu1);
    stulist.add(stu2);
    stulist.add(stu3);
        for (int i = 0; i < stulist.size(); i++) {
            System.out.println("the th:" + i +"'s student's name is:" + stulist.get(i).getName());
        }
    }
}
