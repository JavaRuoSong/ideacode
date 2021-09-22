package com.atguigu.java;

import java.util.Comparator;

/**
 * @author shkstart
 * @create 2021-08-24 12:46
 */
public class CompareTest {
    public static void main(String[] args) {

        Character A = 'a';
        Character b = 'b';
        System.out.println(A.compareTo(b));
    }
}
/*Comparator接口使用：定制排序
*1.
*   当元素的类型没有实现java.lang.Comparable接口而又不方便修改代码。
*   或者实现了java.lang.Comparable接口的排序规则不适合打当前的操作
*   那么可以考虑使用Comparator的对象来排序
*2.
*
*
* */
class goods implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return 1;
    }
}
