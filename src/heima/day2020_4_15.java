package heima;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class day2020_4_15_1{
    private String name;
    private String sex;

    public day2020_4_15_1() {
    }

    public day2020_4_15_1(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "day2020_4_15_1{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
public class day2020_4_15 {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new day2020_4_15_1("zhangfsna","jfsuoidg"));
        col.add(new day2020_4_15_1("dsjaiogj","sjdaiogj"));
        Iterator iterator = col.iterator();
        for(Object o : col){
            System.out.println(o);

        }
    }
}
