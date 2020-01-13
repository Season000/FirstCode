package heima;
import java.util.ArrayList;

//ArrayList用法,数组的长度不可改变，arraylist可以改变
//ArrayList<E>,中的E是泛型，泛型只能是引用类型，不能是基本类型
public class day2020_1_13_5 {
    public static void main(String args[]){
//        ArrayList<String> list = new ArrayList<>();//ArrayList中全部是String类型
//        System.out.println(list);//打印的是ArrayList中的内容
//        list.add("xiaoming");
//        System.out.println(list);

        //ArrayList中的常用方法：
        /*
        .add()
        .get(index)
        .remove(index)      有返回值，返回被删除对象
        .size()
         */
        ArrayList<String> list = new ArrayList<>();
        System.out.println("1.the list is:" + list);
        list.add("String1");
        System.out.println("2.the list is:" + list);
        String temp = list.get(0);
        System.out.println("the temp is:" + temp);
        list.remove(0);
        System.out.println("3.the list is:" + list);
        list.add("string2");
        list.add("string3");
        System.out.println("the list's size is:" + list.size());


        /*
        如果ArrayList中需要存储基本类型，需要用对应包装类
        基本类型        包装类（引用类型）
        byte            Byte
        short           Short
        int             Integer
        long            Long
        float           Float
        double          Double
        boolean         Boolean
        char            Character
         */
        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(10);
        System.out.println("the listB is:" + listB);
    }
}
