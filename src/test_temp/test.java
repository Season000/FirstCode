package test_temp;
//"dbs113b4"
//"ds34"


class Solution {
    /**
     * 打印不重复的字符
     * @param str string字符串
     * @return string字符串
     */
    public String printString (String str) {
        int [] countarr = new int[72];
        char [] strarr = str.toCharArray();
        for(char a : strarr){
            countarr[a - 'A']++;
        }
        StringBuilder answer = new StringBuilder();
        for(char a : strarr){
            if(countarr[a - 'A'] == 1 )
                answer.append(a);
        }
        return answer.toString();
    }
}
public class test {
    public static void main(String[] args) {
        Solution temp = new Solution();
        System.out.println(temp.printString("hello"));
    }
}
