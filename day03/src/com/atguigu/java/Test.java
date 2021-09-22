package com.atguigu.java;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author shkstart
 * @create 2021-08-21 10:23
 * <p>
 * <p>
 * 线程生命周期
 * 创建 就绪 运行 阻塞 消亡
 * 同步监视器
 * synchronized(同步监视器（锁）){
 * 操作共享数据的代码
 * }
 * 同步监视器可以是任何一个对象 ！！多个线程共用一个同步监视器
 * 同步方法的同步监视器是   当前类.class
 * 非静态同步方法   this
 * 静态（随着类加载而加载，不能调用this）同步方法  当前类.class
 * <p>
 * 共享数据
 * 多个线程共同操作的数据
 * sleep() 使当前线程阻塞，不释放锁
 * wait()  阻塞，释放锁  只能用在同步中 需要和notify() notifyAll()成对出现；
 *
 * 线程生命周期注意两个概念：状态 ，相应的方法
 * 关注：状态a-->状态b ：那些方法执行了（回调方法）
 *          某个方法主动调用：状态a-->状态b
 *解决线程安全的方法：
 * 1.同步代码块
 *      synchronized(同步监视器){
 *          //需要被同步的代码
 *      }
 *2.同步方法
 *
 * 3. Lock锁    jdk5.0新增
 *      private ReentrantLock lock = new ReentrantLock();
 *      lock.lock();
 *      lock.unlock();
 *
 *
 * synchronized与lock异同
 *
 * 相同点：二者都可以解决线程安全问题
 * 不同点：synchronized机制在执行完相应的同步代码之后，自动释放同步监视器
 *        lock需要手动的启动同步lock(),同时结束同步也需要手动的实现unlock()
 *
 *使用的优先顺序：（按性能）
 * lock -->  同步代码块（已经进入了方法体，分配了相应的资源） --> 同步方法（在方法体之外）
 *
 *
 * callable
 * 重写call()方法
 * call()可以抛出异常，获取异常信息
 * Callable是支持泛型的
 *
 *
 *
 *
 *
 *
 */
class Bank {
    Bank b1 = null;
    private ReentrantLock lock = new ReentrantLock();
//    public synchronized  Bank getb1(){

    public Bank getb1() {
        synchronized (Bank.class) {

//            try {
//                Bank.class.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

            if (b1 == null) {
                b1 = new Bank();
                return b1;
            } else {
                return b1;
            }

        }
    }
}
class Stu implements Callable{
    @Override
    public Object call() {
        System.out.println(5);
        return 0;
    }
}
public class Test {
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println(b.getb1());
        Stu s1 = new Stu();
        FutureTask f1 = new FutureTask(s1);
        Thread t1 = new Thread(f1);
        t1.start();
        System.exit(5);
    }
}