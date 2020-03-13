package heima;

public class day2020_3_13_2 {
    public static void main(String[] args) {
        int [] temp = new int[3];
        int [] temp1 = null;
        System.out.println(getElement(temp,3));
    }
    public static int getElement(int [] arr, int index){
        if(arr == null){
            throw new NullPointerException("传递的数组的值为空");
        }
        if(index < 0 || index > arr.length-1){
            throw new ArrayIndexOutOfBoundsException("数组下标越界");
        }
        return arr[index];
    }
}
