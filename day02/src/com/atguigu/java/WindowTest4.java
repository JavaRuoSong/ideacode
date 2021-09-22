package com.atguigu.java;

/**
 * @author shkstart
 * @create 2021-08-18 16:23
 */
class Window extends Thread {
    private static int ticket = 100;

    public Window(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (; ; ) {
            show();
        }

    }
    public static synchronized void show(){//同步监视器为window.class 同步方法需为静态的
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " 票号：" + ticket);
            ticket--;
        }
    }
}

public class WindowTest4 {
    public static void main(String[] args) {
        Window w1 = new Window("窗口一");
        Window w2 = new Window("窗口二");
        Window w3 = new Window("窗口三");

        w1.start();
        w3.start();
        w2.start();
    }
}