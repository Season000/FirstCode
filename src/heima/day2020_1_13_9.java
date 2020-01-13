package heima;
//字符串的比较方法
public class day2020_1_13_9 {
    public static void main(String[] args) {
        //==是地址比较
        //equal方法:  a.equals(b) b.euqals(a)一样
        String str1 = "hello";
        String str2 = "hello";
        char [] array = {'h','e','l','l','o'};
        String str3 = new String(array);

        System.out.println(str1==str3);//false
        System.out.println(str1.equals(str3));//true
        System.out.println(str3.equals("hello"));//true
        str3 = new String();
        System.out.println("hello".equals(str3));//false

        //常量和变量比较，推荐把常量写在前面
        String str4 = "abc";//String str4 = null,第二种方法就会报错
        System.out.println("abc".equals(str4));//推荐
        System.out.println(str4.equals("abc"));//不推荐
        //如果str4中是null值的话，第二种方法会报错,比如不输入密码的时候


        //equalsIgnoreCase:忽略大小写的比较方法
        String str5 = "hello";
        String str6 = "HELLO";
        System.out.println(str5.equals(str6));//false
        System.out.println(str5.equalsIgnoreCase(str6));//ture
    }
}
