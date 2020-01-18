package thread;

import sun.awt.windows.ThemeReader;

//获取线程的名称
/*
* 1.使用Thread类中的getName（）方法，String getName()返回该线程的名称
* 2.可以先获取到当前正在实行的线程，再使用getName():static Thread currentThread()
* */
class day_1_18_2_Thread extends Thread{
    @Override
    public void run() {
        //获取线程名称1
        String name = getName();
        System.out.println("fangfa1:" + name);

        //获取线程名称2
        Thread t = Thread.currentThread();
        System.out.println("fangfa2:" + t);
        String strname = t.getName();
        System.out.println(strname);
    }
}
public class day1_18_2 {
    public static void main(String[] args) {
        day_1_18_2_Thread mt1 = new day_1_18_2_Thread();
        day_1_18_2_Thread mt2 = new day_1_18_2_Thread();

        mt1.start();
        mt2.start();
    }
}
