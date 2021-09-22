package com.atguigu.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author shkstart
 * @create 2021-08-29 14:46
 */
/*
* 1.Map：双列数据，用于存储具有key-value对的数据  ---类似于高中的函数 y = f(x);
*         HashMap:作为Map主要实现类：线程不安全，效率高。可以存储null的key和value；
*               LinkedHashMap:
*         TreeMap:
*         Hashtable:线程不安全，效率低;不能存储null的key和value；
*           Properties:
*
*
* 2.Map结构的理解：
*   Map中的key：无序的，不可重复的，使用Set存储所有的key--->key所在的类要重写hashCode()和equals()方法（以HashMap为例）
*         value：无序的，可重复的，使用collection存储所有的value------->value所在的类要重写equals()
*   一个键值对：key-value构成一个Entry对象。
*   Map中的Entry：无序的，不可重复的，使用Set存储所有entry。
*Map hashMap = new HashMap();
*   经过实例化后，底层创建了一个长度为16的 Entry[] table
*       hashMap.put(key1,value1)
* 3.HashMap底层实现原理：
*   jdk7：首先调用元素key1所在类中的hashCode()方法，计算元素的哈希值。
 *      此哈希值接着通过某种算法计算出在HashMap底层数组中的存放位置（即为：索引位置），判断数组
 *      此位置上是否有元素：
 *          1.如果没有元素，则元素(key1,value1)添加成功！！！！！！！！！！！！！！
 *          2.如果此位置有其他元素key2-value2（或者已经存在以链表形式存在的多个元素），首先比较元素1与元素2的
 *          哈希值：
 *              1.1如果哈希值不相同，则元素1添加成功！！！！！！！！！！！！！！
 *              2.如果哈希值相同：
 *                  2.1调用元素key1所在类的equals(key2)方法，如果false，添加成功，！！！！！！！！
 *                  2.2返回true，value1替换掉value2
*
*       ！！！一个位置上的多个元素以链表的方式存储
*           在不断添加的过程中，会涉及到扩容的问题，默认的扩容方式：扩容为原来容量的2倍，并将原有的数据复制过来
*
*
*
* */
public class MapTest {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
   //     hashMap = new Hashtable();
        hashMap.put(1,2);
        hashMap.put(12,22);
        hashMap.put(13,23);
        hashMap.put(14,24);
        //entry(),返回键值对  遍历map 方式一：
        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
            //方式二
        Set set1 = hashMap.keySet();
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()){
            Object key = iterator1.next();
            System.out.print(key+"=");
            System.out.println(hashMap.get(key));
        }
        //valueSet()
        //keySet()
//        Set set1 = hashMap.keySet();
//        System.out.println(set1);
        //get(key)
        boolean b = hashMap.containsKey(1);

    }
}
