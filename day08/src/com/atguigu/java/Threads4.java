package com.atguigu.java;

/**
 * @author shkstart
 * @create 2021-09-02 16:15
 */
public class Threads4 {

        public static void main(String[] args){
            new Threads4().go();
        }
        public void go(){
            Runnable r=new Runnable(){
                public void run(){
                    System.out.print("foo");
                }
            };
            Thread t=new Thread(r);
            t.start();
        }
    }

