package com.atguigu.java;

/**
 * @author shkstart
 * @create 2021-08-11 17:25
 */
class Window extends Thread{
    private static int ticket = 100;
    public Window(String name){
        super(name);
    }

    @Override
    public void run() {
        for(;;){
            if(ticket>0){
                System.out.println(Thread.currentThread().getName()+" 票号："+ticket);
                ticket--;
            }else{
                break;
            }
        }

    }
}
public class WindowTest {
    public static void main(String[] args) {
        Window w1 = new Window("窗口一");
        Window w2 = new Window("窗口二");
        Window w3 = new Window("窗口三");

        w1.start();
        w3.start();
        w2.start();
        System.out.println(w1.getName()+w1.isAlive());
//        w1.stop();
//        w3.stop();
//        w2.stop();

    }
}

