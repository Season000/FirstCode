package thread;
//创建进程的第二种方式：申明为Runnable接口，重写run方法
/*
* 1.创建一个Runnable接口的实现类
* 2.在实现类中重写Runnable接口的run方法
* 3.创建一个Runnable接口的实现对象
* 4.创建Thread类对象，构造方法种传递Runnable接口的实现类对象
* 5.调用Thread类中的start方法，开启新线程
* */

/*实现Runnable接口创建多线程的好处：
* 1.避免了单继承的局限性
* 2.增强了程序的扩展性，降低了程序的耦合性
*   实现类中重写了run方法
* */
class Runnableimpl implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class day_1_18_5 {
    public static void main(String[] args) {
        Runnableimpl run = new Runnableimpl();
        Thread t = new Thread(run);
        t.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
