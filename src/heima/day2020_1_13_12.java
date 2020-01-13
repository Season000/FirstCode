package heima;
//字符串的分割方法
/*
public [] String split(String regex):按照regex的规则，切分成若干部分
 */
public class day2020_1_13_12 {
    public static void main(String[] args) {
        String str = "aaa,bbb,ccc,ddd,eee";
        String [] strarray = str.split(",");
        for (int i = 0; i < strarray.length; i++) {
            System.out.print(strarray[i] + "  ");
        }
        System.out.println();
        System.out.println("================");
        //切割“.”的时候，要加“\\”,regex为正则表达式
        String str1 = "aaa.bbb.ccc";
        String [] strarray1 = str1.split("\\.");
        for (int i = 0; i < strarray1.length; i++) {
            System.out.print(strarray1[i] + "  ");
        }
    }
}
