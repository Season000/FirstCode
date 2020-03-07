package heima;

public class day2020_3_7_1 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6};
        int [] arr2 = {9,8,7,6,5,4};
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
        System.out.println();
        System.arraycopy(arr1,0,arr2,2,3);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }


    }
}
