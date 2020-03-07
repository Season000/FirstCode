package LeetCode;
//字符串有三种编辑操作:插入一个字符、删除一个字符或者替换一个字符。
//给定两个字符串，编写一个函数判定它们是否只需要一次(或者零次)编辑。

//ex:输入:
//        first = "pale"
//        second = "ple"
//        输出: True

//123456789
//12346789
//123450789

import java.util.Arrays;

class Solution_5 {
    public boolean oneEditAway(String first, String second) {
        if(Math.abs(first.length() - second.length()) > 1){
            return false;
        }
        int count = 0;
        int doulen = first.length() - second.length();
        int i = 0, j = 0;
        for(;i < first.length() && j < second.length();){
            if(first.charAt(i) == second.charAt(j)){
                i++;
                j++;
            }
            else{
                if(doulen > 0){
                    i++;
                }
                if(doulen < 0){
                    j++;
                }
                if(doulen == 0){
                    i++;
                    j++;
                }
                count++;
                if(count > 1)
                    return false;
            }
        }
        return true;
        }
}
public class num_5 {
    public static void main(String[] args) {
        Solution_5 temp = new Solution_5();
//        temp.oneEditAway("abcc","cbcd");
        System.out.println(temp.oneEditAway("ab","bc"));


    }
}
