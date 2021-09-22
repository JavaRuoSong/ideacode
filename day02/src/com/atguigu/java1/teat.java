package com.atguigu.java1;

/**
 * @author shkstart
 * @create 2021-08-20 19:49
 */
public class teat {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
