package LeetCode;

class Solution_6 {
    public String compressString(String S) {
        if(S.length()<1)
            return S;
        StringBuilder result = new StringBuilder();
        result.append(S.charAt(0));
        int count = 1;
        for (int i = 1; i < S.length(); i++) {
            if(result.charAt(result.length()-1) == S.charAt(i)){
                count++;
            }
            else{
                result.append(count);
                count = 1;
                result.append(S.charAt(i));
            }
        }
        result.append(count);
        if(result.length() >= S.length())
            return S;
        else
            return result.toString();
    }
}
public class num_6 {
    public static void main(String[] args) {
        Solution_6 temp = new Solution_6();
        System.out.println(temp.compressString(""));
    }
}
