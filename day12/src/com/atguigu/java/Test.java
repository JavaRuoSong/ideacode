package com.atguigu.java;

import java.io.Serializable;

/**
 * @author shkstart
 * @create 2021-09-10 10:05
 *
 *
 *URL url = new URL("http://ip地址")
 *
 *
 *对象序列化：
 * ！！要求：1.实现serializable接口
 *          2.提供版本序列号
 *          3.要求对象的属性也是可序列化的。（基本数据类型，String：本身就是可序列化的 ）
 *   反序列化：
 *
 *
 *
 *
 *
 *
 *
 */
public class Test implements Serializable {
    public static void main(String[] args) {
        new Student().eat();
    }

}
abstract class person{
    public String name;

    public person(){

    }

    public abstract void eat();

    public String getName(){
       return this.name = name;
    }
}

class Student extends person {
    @Override
    public void eat() {
        System.out.println("吃学生餐");
    }

}