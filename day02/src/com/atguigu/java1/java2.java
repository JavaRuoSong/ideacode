package com.atguigu.java1;

/**
 * @author shkstart
 * @create 2021-08-19 11:33
 * wait();notify();notifyAll()必须使用在同步方法或同步代码块中，
 * 且方法的调用者必须是同步代码块或同步方法的同步监视器，否则会出现IllegalMonitorStateException异常
 * 这三个方法定义在Object类中
 */
class window implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        for (; ; ) {
            synchronized(window.class) {
                window.class.notify();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (ticket > 0) {
                    System.out.println(Thread.currentThread() + "票号为:" + ticket);
                    ticket--;
                } else {
                    break;
                }
                try {
                    window.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class java2 {
    public static void main(String[] args) {
        window w1 = new window();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
  //      Thread t3 = new Thread(w1);
        t1.setName("窗口1");
        t2.setName("窗口二");
  //      t3.setName("窗口三");
        t1.start();
        t2.start();
   //     t3.start();

    }
}
