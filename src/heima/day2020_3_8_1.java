package heima;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class day2020_3_8_1 {
    public static void main(String[] args) {
        Collection<String> temp = new ArrayList<>();
        temp.add("ajdi");
        temp.remove(0);

        Iterator<String> it = temp.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
