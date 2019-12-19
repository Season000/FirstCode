package char2_4;

class Array1{
    private int [] data;
    private int foot = 0;
    public Array1(int len){
        this.data = new int[len];
    }
    public void add(int num){
        if (this.foot < this.data.length){
            this.data[foot++] = num;
        }
        else{
            System.out.println("溢出！");
        }
    }
    public int [] getData(){
        return this.data;
    }
}

class Sort extends Array1{
    public Sort(int len){
        super(len);
    }
    public int [] getData(){
        int [] temp1 = super.getData();
        for (int k = 0 ; k < temp1.length ; k ++){
            temp1[k] = 0;
        }
        return temp1;
    }
}

public class temp {
    public static void main(String args[]){
    Array1 arr = new Sort(5);
    arr.add(10);
    arr.add(20);
    arr.add(30);
    arr.add(40);
    arr.add(50);
    int [] temp = arr.getData();
    for(int i = 0 ; i < temp.length ; i ++){
        System.out.print(temp[i] + "  ");
    }
    }
}
