package com.atguigu.java;

import java.util.HashSet;
import java.util.Set;

/**
 * @author shkstart
 * @create 2021-08-28 15:26
 * HashSet:作为Set接口的主要实现类；线程不安全的；可以存储null值
 * LinkedHashSet:作为HashSet的子类；遍历其内部数据时，可按照添加的顺序遍历
 * TreeSet:可以按照对象的指定属性，进行排序。
 *底层：数组加链表
 *
 *
 *
 *无序的（没有索引）
 *1.无序性：不等于随机性。存储的数据在底层数组中并非按照数组索引的顺序添加，而是根据数据的哈希值决定的
 *
 *2.不可重复性:保证添加的元素按照equals()判断时，不能返回true，即：相同元素只能添加一个
 * 添加元素的过程：以HashSet为例：
 *      我们向HashSet中添加元素a，首先调用元素a所在类中的hashCode()方法，计算元素a的哈希值。
 *      此哈希值接着通过某种算法计算出在HashSet底层数组中的存放位置（即为：索引位置），判断数组
 *      此位置上是否有元素：
 *          1.如果没有元素，则元素a添加成功！！！！！！！！！！！！！！
 *          2.如果此位置有其他元素b（或者已经存在以链表形式存在的多个元素），首先比较元素a与元素b的
 *          哈希值：
 *              1.1如果哈希值不相同，则元素a添加成功！！！！！！！！！！！！！！
 *              2.如果哈希值相同：
 *                  2.1调用元素a所在类的equals方法，如果false，添加成功，！！！！！！！！
 *                  2.2返回true，添加失败
 *     ！！！！！！！！！  对于1.1和2.1而言，元素a与已经存在指定索引位置上数据以链表的方式存储    ！！！！！！！！！！
 *jdk7：元素a放到数组中，指向原来的元素
 * jdk8：原来的元素在数组中，指向元素a
 * 七上八下
 *
 * 要求：向Set中添加数据的对象所在的类，一定要重写equals()和hashCode()方法
 *      重写的equals()和hashCode()方法应有一致性：相同的对象必须有相同的散列码
 *
 */
public class SetList {
    public static void main(String[] args) {
        Set s1 = new HashSet();
        s1.add(123);
//        s1.add(123);
        s1.add("too");
        s1.add(465);
        s1.add(789);
        s1.add(new person("rose",123));
        s1.add(new person("rose",123));//地址值不同，没重写equals方法
        System.out.println(s1);

    }
}
