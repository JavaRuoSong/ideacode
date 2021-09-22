package com.atguigu.java;

class window2 implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        for (; ; ) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread() + "票号为:" + ticket);
                ticket--;
            } else {
                break;
            }

        }

    }
}

public class WindowTest2 {
    public static void main(String[] args) {
        window2 w1 = new window2();
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