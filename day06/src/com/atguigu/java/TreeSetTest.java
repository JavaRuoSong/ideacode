package com.atguigu.java;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author shkstart
 * @create 2021-08-29 7:07
 *//*
 * TreeSet:
 *
 *1.向TreeSet中添加的数据，要求是相同类的对象
 *2.两种排序的方式；自然排序（实现comparable接口）和定制排序（Comparator接口）。
 * 3.自然排序中，比较两个对象是否相同的标准为：compareTo()返回0，不再是equals().
 *
 *
 *
 *
 *
 * */
public class TreeSetTest {
    public static void main(String[] args) {
        Set s1 = new TreeSet();
        //失败：不能添加不同类的对象
//        s1.add(123);
////        s1.add(123);
//        s1.add("too");
//        s1.add(465);
//        s1.add(789);
//        s1.add(new person("rose",123));
//        s1.add(new person("rose",123));
        s1.add(231);
        s1.add(782);
        s1.add(44);
        s1.add(33);
        s1.add(98);
        s1.add(789);
        s1.add(546);
        s1.add(123);
//        Comparator comparator = new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return 0;
//            }
//
//            @Override
//            public boolean equals(Object obj) {
//                return false;
//            }
//        };
    }
}
