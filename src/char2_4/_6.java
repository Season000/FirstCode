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

    public void print(){
        for(int i = 0 ; i < this.data.length ; i ++){
            System.out.print(this.data[i] + " ");
        }
    }

    public int[] getData(){
        return this.data ;
    }
}


public class _6 {
    public static void main(String args[]){
        Array arr = new Array(3);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.print();
        int [] temp = arr.getData();
        for (int i = 0 ; i < temp.length ; i ++){
            System.out.print(temp[i] + "  ");
        }

    }

}
