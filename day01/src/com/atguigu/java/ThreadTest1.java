package com.atguigu.java;

/**
 * @author shkstart
 * @create 2021-08-13 15:11
 */
class Mythread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
public class ThreadTest1 {
    public static void main(String[] args) {
        Mythread m1 = new Mythread();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}

//class Mythread implements Runnable{
//    @Override
//    public void run() {
//        for (int i = 0; i <100 ; i++) {
//            if(i%2==0){
//                System.out.println(i);
//            }
//        }
//    }
//}