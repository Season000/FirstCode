package _temp;

import java.util.ArrayList;
import java.util.Scanner;

//               a  ,  ,  1  ,  "b,"""
//               a   --   1      b,"
public class _temp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();//input
        boolean flag1 = false;//未遇到引号
        boolean flag2 = true;//引号已配对
        String [] answer = new String[str.length()];
        int k = 0;
        int j = 0;
        int count = 0;
        char [] strarr = str.toCharArray(); //splitall
        ArrayList<Character> answerlist = new ArrayList<Character>();
        //System.out.println(str);
        for (int i = 0; i < strarr.length; i++) {
            if(strarr[i] != ','){
                answerlist.add(strarr[i]);
                continue;
            }
            if(strarr[i] == ','){
                if(strarr[i-1] != ',')
                    answerlist.add('#');        //有逗号必定有分割
                if(strarr[i+1] == ','){
                    answerlist.add('-');
                    answerlist.add('-');
                    answerlist.add('#');
                }
            }
            if(strarr[i] == '"'){
                count++;
                if(strarr[i-1] == ',')
                    answerlist.add('#');
                for(j = i+1 ;  ; j++){
                    if(strarr[j] == '"'){
                        count++;
                    }

                }
            }
        }

        System.out.print(answerlist + " ");
        String finishtemp = String.valueOf(answerlist);
        String [] finish = finishtemp.split("#");
        String [] finisharr = new String[finish.length];

        System.out.println(finish.length);
        for (int i = 0; i < finish.length; i++) {
            int num = 0;
            if(finish[i] != ",")
                finisharr[num++] = finish[i];
        }
        for (int i = 0; i < finisharr.length; i++) {
            System.out.println(finisharr[i]);
        }

    }
}
