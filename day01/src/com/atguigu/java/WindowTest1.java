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
    *
    *
    * */
class window implements Runnable{
    private int ticket = 100;
    @Override
    public void run() {
        for(;;) {
            if(ticket>0) {
                System.out.println(Thread.currentThread()+"票号为:" + ticket);
                ticket--;
            }else{
                break;
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
