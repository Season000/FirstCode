package heima;
//对象数组
public class day2020_1_13_4 {
    public static void main(String args[]) {
        //创建长度为3的数组，存放person对象
        person [] array = new person[3];
        array[0] = new person("zhangsan",18);
        System.out.println(array[0].getInfo());
        array[0].setName("xiaoming");
        System.out.println(array[0].getInfo());
    }
}
