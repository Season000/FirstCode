package heima;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class day_2020_4_15_2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jsaoidjig");
        list.add(123);
        list.add("sjaidg");
        list.add(123);
        list.add(2,"second");

        for(Object o : list){
            System.out.println(o);
        }
        System.out.println("============");
        System.out.println(list.get(2));
        System.out.println("================");
        System.out.println(list.set(2,"third"));
        System.out.println(list.get(2));

    }
}
