package heima;

import java.util.Objects;

class day2020_3_6_1_1{
    private String name;
    private int num;
    public void setName(String name){
        this.name = name;
    }
    public void setNum(int num){
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }
//    public boolean equals(Object obj){
//        if(obj == null)
//            return false;
//        if(obj instanceof day2020_3_6_1_1){
//            day2020_3_6_1_1 tempobj = (day2020_3_6_1_1)obj;
//            return this.name == tempobj.name && this.num == tempobj.num;
//        }
//        else
//            return false;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;//利用反射技术
        day2020_3_6_1_1 that = (day2020_3_6_1_1) o;
        return num == that.num &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, num);
    }
}
public class day2020_3_6_1 {
    public static void main(String[] args) {
        day2020_3_6_1_1 temp1 = new day2020_3_6_1_1();
        day2020_3_6_1_1 temp2 = new day2020_3_6_1_1();
        temp1.setName("zhangsan");
        temp1.setNum(1);
        temp2.setName("zhangsan");
        temp2.setNum(1);
        System.out.println(temp1.equals(temp2));

    }
}
