package com.atguigu.java;

/**
 * @author shkstart
 * @create 2021-08-23 12:43
 * <p>
 * String的不可变性，修改 已经存在的字符串时，已经存在的字符串不会改变，方法区中的字符串常量池中会新建一个
 */


public class Test {
    public static void main(String[] args) {
        String s = new String("123");
        String s1 = String.valueOf(5);
        Integer.parseInt(s);
    }
}
