package heima;

import java.util.ArrayList;
import java.util.Random;

//练习题3：用一个大集合存入20个随机数字，将其中的偶数元素放到小集合中
public class day2020_1_13_8 {
    public static void main(String args[]){
        //大集合产生20个随机数字
        ArrayList<Integer> list = new ArrayList<>();
        //小集合存放偶数集合
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(new Random().nextInt(100));
            if(list.get(i) %2 ==0){
                list1.add(list.get(i));
            }
        }
        System.out.println(list);
        System.out.println(list1);


    }
}
