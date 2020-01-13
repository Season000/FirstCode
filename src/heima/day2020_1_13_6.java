package heima;
import java.util.ArrayList;
import java.util.Random;
//练习题1：生成6个1-33之间的随机整数，添加到集合，并遍历集合
public class day2020_1_13_6 {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add(new Random().nextInt(33)+1);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
