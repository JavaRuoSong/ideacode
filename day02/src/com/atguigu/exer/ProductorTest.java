package com.atguigu.exer;

/**
 * @author shkstart
 * @create 2021-08-19 11:55
 */
//class Num extends Thread {
//    @Override
//    public void run() {
//        synchronized (obj) {
//            for (int i = 1; i < 53; i += 2) {
//                System.out.print(i);
//                System.out.print(i + 1);
//
//                try {
//                    wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//    }
//
//}
//
//class Word extends Thread {
//    @Override
//    public void run() {
//        synchronized (obj) {
//            for (char i = 65; i < 91; i++) {
//                System.out.print(i);
//
//                try {
//                    wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//}

public class ProductorTest {
    public static void main(String[] args) {
        Object obj = new Object();
//        Num n1 = new Num();
//        Word w1 = new Word();
//        n1.start();
//        w1.start();
        new Thread() {
            @Override
            public void run() {
                synchronized (obj) {

                    for (int i = 1; i < 53; i += 2) {
                        obj.notify();
                        System.out.print(i);
                        System.out.print(i + 1);

                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();
        new Thread(new Runnable() {


            @Override
            public void run() {
                synchronized (obj) {

                    for (char i = 65; i < 91; i++) {
                        obj.notify();
                        System.out.print(i);

                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }

        }).start();
    }
}
