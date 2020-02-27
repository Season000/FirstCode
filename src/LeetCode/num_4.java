package LeetCode;

class Solution_4 {
    public boolean canPermutePalindrome(String s) {
        int [] arr = new int[128];
        for(char ch:s.toCharArray()){
            arr[ch]++;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 != 0)
                sum++;
        }
        if(sum >= 2)
            return false;
        else
            return true;
    }
}

public class num_4 {
    public static void main(String[] args) {
        Solution_4 temp = new Solution_4();
        System.out.println(temp.canPermutePalindrome("civ##//ic"));
    }
}

