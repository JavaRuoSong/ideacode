package com.atguigu.java;

/**
 * @author shkstart
 * @create 2021-08-13 15:45
 */
//创建多线程方式二： 优先选择
    /*1.接口实现的方式没有单继承的局限性
    *2.实现的方式更适合来处理多个线程共享数据的情况
    *
    *
    *
    *二者联系     class Thread implements Runnable {
    *两种方式都需要重写run'方法，将线程要执行的逻辑写在方法体中
    *
    *
    * !!
    * synchronized (同步监视器){
    *   需要被同步的代码
    *
    * }
    * 说明：操作共享数据的代码，即为需要被同步的代码
    *       共享数据：多个线程共同操作的变量 。 比如：ticket就是共享数据
    *       同步监视器：俗称：锁。任何一个类的对象都可以承当锁  !!要求多个线程必须共用同一把锁
    *
    *       操作同步代码时只能有一个线程参与，其他线程等待，解决了线程安全问题，但是相当于单线程，执行速度变慢
    * */
class window implements Runnable{
    private int ticket = 100;
    Object obj = new Object();
    @Override
    public void run() {
        for(;;) {
            synchronized (obj) {//同步监视器，（锁）
                if (ticket > 0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread() + "票号为:" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

public class WindowTest1 {
    public static void main(String[] args) {
        window w1 = new window();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);
        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");
        t1.start();
        t2.start();
        t3.start();

    }
}
