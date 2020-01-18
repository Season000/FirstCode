package thread;
//java.lang.Thread类是描述线程的类,想要实现多线程程序就必须继承Thread类
/*
* 要求：
* 1.创建一个Thread类的子类
* 2.重写Thread类中的run方法,设置线程任务
* 3.创建Thread子类对象
* 4.调用thread中的start（）方法，开启线程，执行run方法
* */
//多线程
//创建多线程程序的第一种方式

import com.sun.deploy.security.MozillaMyKeyStore;

//两个线程并发执行，多次启动一个线程是非法的,java属于抢占式
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run:" + i);
        }
    }
}
public class day1_18_1 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main:" + i);
        }
    }

}
