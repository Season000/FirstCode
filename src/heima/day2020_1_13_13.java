package heima;
//练习题1：定义一个方法，将数组1,2,3按照格式分割成一个字符串，格式：[word1#word2#word3]
public class day2020_1_13_13 {
    public static void main(String[] args) {
        int [] str1 = {1,2,3};
        String str = arraytoString(str1);
        System.out.println(str);
    }
    public static String arraytoString(int [] str){
        String result = "[";
        for (int i = 0; i < str.length; i++) {
            if (i < str.length - 1){
                result += "word" + str[i] + "#";
            }
            else{
                result += "word" + str[i] + "]";
            }

        }
        return result;
    }
}
