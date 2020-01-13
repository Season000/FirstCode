package heima;



import java.util.Scanner;
import java.util.ArrayList;

//练习题2：用户键盘输入一串字符串，统计各种字符出现的次数
//大写字母，小写字母，数字，其他
public class day2020_1_13_14 {
    public static void main(String[] args) {
        System.out.println("please input a string:");
        String str = new Scanner(System.in).next();
//        ArrayList<Character> strarray = new ArrayList<>();//没必要
        int daxie = 0;
        int xiaoxie = 0;
        int shuzi = 0;
        int qita = 0;
        char [] strtemp = str.toCharArray();
        for (int i = 0; i < strtemp.length; i++) {
            if(strtemp[i]>='A' && strtemp[i]<='Z'){
                daxie ++;
            }else if(strtemp[i]>='a' && strtemp[i]<='z'){
                xiaoxie ++;
            }else if(strtemp[i]>=0 && strtemp[i]<=9){
                    //(Character.isDigit(strtemp[i])){//判断是否为数字
                shuzi ++;
            }else{
                qita ++;
            }
        }
        System.out.println("大写字母：" + daxie +",小写字母："
                + xiaoxie + ",数字：" + shuzi + ",其他:" + qita);
    }
}
