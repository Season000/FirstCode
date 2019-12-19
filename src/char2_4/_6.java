package char2_4;

class Array{
    private int data[];
    private int foot ;//表示数组的操作角标
    public Array(int len){
        if(len > 0){
            this.data = new int[len];
        }
        else{
            this.data = new int[1];
        }

    }
    public boolean add(int num){
        if(this.foot < this.data.length){
            this.data[this.foot++] = num;
            return true;
        }
        else{
            System.out.println("输入溢出,只保留前" + this.data.length + "个数据");
            return false;
        }
    }

    public int[] getData(){
        return this.data ;
    }
}

class SortArray extends Array{
    public SortArray(int len){
        super(len);//调用父类的有参构造方法，data数组就可以初始化
    }
    //因为父类中的getData方法不够排序类使用，所以进行覆写
    public int[] getData(){
        java.util.Arrays.sort(super.getData());
        return super.getData();
    }
}

class exchange extends Array{
    public exchange(int len){
        super(len);
    }
    public int[] getData(){
        int [] temp1 = super.getData();
        for (int i = 0 ; i < temp1.length/2 ; i ++){
                int tempnum = temp1[i];
                temp1[i] = temp1[temp1.length - i - 1];
                temp1[temp1.length - i - 1] = tempnum;
                System.out.println("test:" + temp1[i]);
        }
        return temp1;
    }
}

public class _6 {
    public static void main(String args[]){
        Array arr = new exchange(4);
        arr.add(100);
        arr.add(20);
        arr.add(3);
        arr.add(5);
        int [] temp = arr.getData();
        for (int i = 0 ; i < temp.length ; i ++){
            System.out.print(temp[i] + "  ");
        }

    }

}
