package com.atguigu.java;

/**
 * @author shkstart
 * @create 2021-08-18 16:10
 *
 *
 *
 * 使用同步方法解决线程安全问题
 */
class window3 implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        for (; ; ) {
            show();

        }

    }

    public synchronized void show() {//同步监视器 this
        //   synchronized (){
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread() + "票号为:" + ticket);
            ticket--;
        }
    }
    //}
}


public class WindowTest3 {
    public static void main(String[] args) {
        window3 w1 = new window3();
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