package thread;
//设置进程名称（了解）
//1.setName
//2.创建一个带参数的构造方法，参数传递线程名称，调用父类带参构造方法，让父类Thread起名字
//Thread(String name)
class day_1_18_3_Thread extends Thread{
    day_1_18_3_Thread(){

    }
    day_1_18_3_Thread(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println(getName());
        setName("thread-one");
        System.out.println(getName());
    }
}
public class day_1_18_3 {
    public static void main(String[] args) {
        day_1_18_3_Thread th = new day_1_18_3_Thread();
        //th.setName("one");
        th.start();

        day_1_18_3_Thread th1 = new day_1_18_3_Thread("thread-1111");
        th1.start();
    }
}
