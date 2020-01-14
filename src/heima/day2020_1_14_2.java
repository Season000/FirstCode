package heima;

import java.util.Arrays;

//Arrays类,java.util.Arrays;提供了静态方法
/*
* public static String toString(array)将参数数组变为字符串
* public static void sort(array)将数组元素从小到大排序
*
* */
public class day2020_1_14_2 {
    public static void main(String[] args) {
        int [] array = {1,3,2,4,5};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        String str = Arrays.toString(array);
        System.out.println();
        System.out.println("the string is: " + str);
        System.out.println("============");

//        System.out.println("after sort:" + Arrays.sort(array))
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        System.out.println("after sort: " + Arrays.toString(array));
        String str2 = "fjsidfjlsixkimgilds";
        daoxu(str2);
    }

    public static void daoxu(String str){

        char [] temp = str.toCharArray();
        Arrays.sort(temp);
        for (int i = temp.length - 1; i >= 0; i--) {
            System.out.print(temp[i] + " ");
        }

    }

}
