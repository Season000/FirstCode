package heima;
//String中与转换相关的常用方法
/*
public char[] toCharArray():将当前字符串拆分成单个字符
public byte[] getBytes():获得当前字符换底层字节数据
public String replace(oldstring ,newstring):将所有出现的老字符串替换成新字符串，并返回新字符串
 */
public class day2020_1_13_11 {
    public static void main(String[] args) {

        //toCharArray()
        String str1 = "abcdefghijklmnopqrstuvwxyz";
        char [] strarray = new char[30];
        strarray = str1.toCharArray();
        for (int i = 0; i < strarray.length; i++) {
            System.out.print(strarray[i] + "  ");
        }
        System.out.println();
        //getBytes()
        byte [] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        //replace()
        String str2 = "hellojavapythongolanguagejavapython";
        String str3 = str2.replace("java","****");
        System.out.println(str2);
        System.out.println(str3);
    }
}
