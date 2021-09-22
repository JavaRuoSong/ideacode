package com.atguigu.java;

import java.util.*;

/**
 * @author shkstart
 * @create 2021-08-28 13:40
 *
 *
 * ArrayList:作为List接口主要实现类；线程不安全，效率高；底层使用object[]存储
 * LinkedList：对于频繁的插入，删除操作，使用此类比ArrayList效率高；底层使用双向链表存储
 * Vector：作为List接口的古老实现类；线程安全，效率低；底层使用object[]存储
 *
 *
 */
public class foreachTest {
    public static void main(String[] args) {
        Collection c2 = new ArrayList();
        c2.add(123);
        c2.add(new String("hahaha"));
        c2.add(456);
        c2.add(new person("tom",12));
        //for(集合元素的类型 局部变量 ：集合对象)增强for循环
        //内部仍然调用了迭代器
//        public Iterator<E> iterator() {
//            return new ArrayList.Itr();
//        }
//        for(Object obj :c2){//内部依次取c2的每个元素赋值给obj
//            System.out.println(obj);
//        }
        List l1 = new ArrayList();
        l1.add(123);
        l1.add("cbsdj");
        l1.add(456);
        l1.add(new person("jj",12));

        System.out.println(l1);
    }
}
