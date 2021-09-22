package com.atguigu.java;

/**
 * 程序：完成特定任务，用某种语言编写的一组指令的集合，指一段静态代码，静态对象
 *
 *
 * 进程：程序的一次执行过程，或是正在运行的一个程序。是一个动态的过程：有他自身的产生，存在和消亡的过程----------生命周期
 *
 *！！！程序是静态的，进程是动态的、
 * 内存分配的一种单位，每个进程有自己的内存空间
 *
 * 线程：进程可进一步细分为线程，是一个程序内部的一条执行路径，
 *          1.若一个进程同一时间并行多个线程，则称他是支持多线程的
 *          2.线程作为调度和执行的单位，每个线程拥有独立的运行栈和程序计数器（pc），线程的切换开销小
 *          3.一个进程中多个线程共享相同的内存单元（从同一堆中分配对象， 方法区和堆），可以访问相同的变量和对象，
 *          这就使得线程间通信更为简便，高效，但多个线程操作共享的系统资源可能会带来安全的隐患
 *
 * 一个Java程序至少有main（）线程 gc（）垃圾回收器线程，异常处理线程 ，发生异常会影响主线程
 *
 *
 *并行与并发
 *并行：多个cpu同时执行多个任务
 * 并发：一个cpu 同时执行多个任务
 *
 *启动一个线程不能调用run() 只能调用start()[作用：启动线程，调用run()]
 *如果再启动一个线程，必须重新创建一个Thread的子类对象，调用此对象的start(),
 *
 *
 *
 * @author shkstart
 * @create 2021-08-10 11:29
 */
class MyThread extends Thread{


    public MyThread(String name){

        super(name);
    }


    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i %2 == 0) {
//                try {
//                    sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(Thread.currentThread().getName() + " " + i);//currentThread():静态方法，可以直接通过类名调用，返回执行当前代码的线程
            }
//            if (i==20){
//                yield();
//            }

        }
//        System.out.println(  this.isAlive());


    }
}





public class ThreadTest {
    public static void main(String[] args) {
        MyThread m1 = new MyThread("thread:15");
//        System.out.println(m1.getName());
        //设置优先级
        m1.setPriority(Thread.MAX_PRIORITY);
        m1.start();

        Thread.currentThread().setName("主线程");
        //设置主线程优先级
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);//并不意味着优先级高就先执行，只是概率上先执行
        for (int i = 0; i < 100; i++) {
            if (i%2==0) {
//                try {
//                    Thread.sleep(100);//sleep()静态方法，当前线程阻塞100ms
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(Thread.currentThread().getName()+" " + i);

            }
//            if(i==20){
//                try {
//                    m1.join();//调用m1的join方法，此时当前线程进入阻塞状态，直到线程m1执行结束，当前线程才继续执行
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }

        }


        System.out.println("分线程 "+m1.isAlive());


    }
}
