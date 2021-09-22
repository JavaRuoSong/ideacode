package com.atguigu.java;

/**
 * @author shkstart
 * @create 2021-08-22 16:03
 *
 *String 为不可变的字符序列
 *
 *String s1 = new String("abc");方式创建对象，在内存中创建了几个对象？
 *  两个；一个是new结构在堆空间中创建的对象，另一个是char[]对应的常量池中的数据。"abc"
 *
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = "java";//通过字面量定义
        String s2 = "ee";
        String ss = "javaee";
        System.out.println(s1 == s2);//比较地址值 是s1与s2指向方法区的同一个地址
        String s3 = s2.replace('a', 'd');
        System.out.println(s2);
        System.out.println(s3);
        String s4 = new String("javaee");//通过构造器定义.在堆空间中。
        String s5 = "javaee";
        System.out.println(s4 == s5);
        String s6 = s4.intern();//调用intern();方法返回值在常量池中。
        System.out.println(s6 == ss);
        String s7 = s1+s2;//变量拼接在堆空间中
        String s8 = "java"+"ee";//字符串拼接在常量池中
        System.out.println(ss == s7);
        System.out.println(s8 == ss);


    }
}
