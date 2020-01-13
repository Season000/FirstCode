package heima;
//String中与获取相关的方法、截取方法
/*
public int length()获取长度
public String concat(String str)拼接
public char charAt(int index)获取指定index的内容
public int indexOf(String str)查找参数字符串在本字符串中的index位置，如果没有，返回-1
 */
public class day2020_1_13_10 {
    public static void main(String[] args) {
        //获取字符串的长度
        System.out.println("hfuosdmjlijiosjg".length());

        //拼接字符串
        String str1 = "hello ";
        String str2 = "java";
        System.out.println(str1.concat(str2));//"hello java"

        //获取指定index的内容
        String str3 = "sdhuaidofijljj";
        System.out.println("(index = 5)'s char is: " + str3.charAt(5));//index = 5的位置其实是第6个字符

        //获取当前字符串的index
        String str4 = "helloworldjavapythonlanguage";
        System.out.println("the index of \"java\" is:" + str4.indexOf("java"));//10
        //用indexOf的时候，如果查找的字符串无法找出匹配，则返回-1


        //String的截取方法
        /*
        public String substring(int index):截取从index位置到末尾的所有字符串，返回新字符串
        public String substring(int begin, int end):截取[begin,end)之间所有的字符，返回新字符串
         */
        String str5 = "jsfoidncuidfkjghjiodsfj";
        System.out.println("from index = 5 to the end:" + str5.substring(5));//dncuidfkjghjiodsfj
        System.out.println("frome index = 2 to index = 6:" + str5.substring(2,6));//2/3/4/5位，不包括6

    }
}
