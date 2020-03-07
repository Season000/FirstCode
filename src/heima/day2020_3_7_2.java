package heima;

public class day2020_3_7_2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abcdefg");
        System.out.println(str);
        System.out.println(str.length());
        str.append("1234").append("this");
        System.out.println(str);
        System.out.println(str.length());
        String s = str.toString();

    }
}
