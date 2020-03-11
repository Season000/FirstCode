package heima;

public class day2020_3_11_1 {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 1;
        System.out.println(a == b);
        System.out.println(a.equals(b));

        System.out.println("=========================");

        Integer c = new Integer(1);
        Integer d = new Integer(1);
        Integer e = Integer.valueOf(1);
        System.out.println(c == d);
        System.out.println(c.equals(d));

        System.out.println("=========================");

        int temp = a.intValue();
        System.out.println(temp);

        System.out.println("=========================");
        int temp1 = Integer.valueOf(1);

        System.out.println(d.compareTo(Integer.valueOf(30)));

    }
}
