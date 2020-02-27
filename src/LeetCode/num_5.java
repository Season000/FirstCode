package LeetCode;
//字符串有三种编辑操作:插入一个字符、删除一个字符或者替换一个字符。
//给定两个字符串，编写一个函数判定它们是否只需要一次(或者零次)编辑。

//ex:输入:
//        first = "pale"
//        second = "ple"
//        输出: True

//123456789
//12346789

import java.util.Arrays;

class Solution_5 {
    public boolean oneEditAway(String first, String second) {
        if(Math.abs(first.length() - second.length()) > 1){
            return false;
        }
        char [] firstarr = first.toCharArray();
        char [] secondarr = second.toCharArray();
//        Arrays.sort(firstarr);
//        Arrays.sort(secondarr);
        int i=0,j;
        while (firstarr[i] == secondarr[i])
            i++;
        if(firstarr.length == secondarr.length){
            j = i+1;
            while (firstarr[j] == secondarr[j])
                j++;
            if(j == firstarr.length)
                return true;
            else
                return false;
        }
        if(firstarr.length > secondarr.length){
//            if(i==0 || i==secondarr.length-1)
            j = i;
            while (firstarr[j+1] == secondarr[j])
                j++;
            if(j == secondarr.length-1)
                return true;
            else
                return false;
        }
        else{
            j = i;
            while (firstarr[j] == secondarr[j+1])
                j++;
            if(j == firstarr.length-1)
                return true;
            else
                return false;
        }
    }
}
public class num_5 {
    public static void main(String[] args) {
        Solution_5 temp = new Solution_5();
        temp.oneEditAway("abced","abcd");

    }
}
