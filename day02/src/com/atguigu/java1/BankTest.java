package com.atguigu.java1;

/**
 * @author shkstart
 * @create 2021-08-18 16:31
 */
public class BankTest {

}

class Bank {
    public Bank() {}

    private static Bank b1 = null;

    //  public static synchronized Bank getb1(){
    public static Bank getb1() {
        //方式一效率稍差
//        synchronized (Bank.class) {
//            if(b1 == null){
//                b1 = new Bank();
//                return b1;
//            }
//            return b1;
//        }
        //方式二
        if (b1 == null) {

            synchronized (Bank.class) {
                if (b1 == null) {
                    b1 = new Bank();
                    return b1;
                }
                return b1;
            }
        }
        return b1;
    }
}