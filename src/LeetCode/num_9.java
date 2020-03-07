package LeetCode;
//字符串轮转。给定两个字符串s1和s2，
//请编写代码检查s2是否为s1旋转而成（比如，waterbottle是erbottlewat旋转后的字符串）。
class Solution_9 {
    public boolean isFlipedString(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;
        int i = (s1+s1).indexOf(s2);
        if(i != -1)
            return true;
        else
            return false;
    }
    //方法2：StringA.contains(StringB)
    public boolean isFlipedString1(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        else
            return (s1+s1).contains(s2);
    }
}

public class num_9 {
    public static void main(String[] args) {
        Solution_9 temp = new Solution_9();
        System.out.println(temp.isFlipedString1("abcdefgabc","abcabcdefg"));//true
        System.out.println(temp.isFlipedString1("cbcdefgabc","abcabcdefg"));//false

    }
}
