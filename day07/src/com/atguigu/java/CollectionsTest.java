package com.atguigu.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author shkstart
 * @create 2021-08-31 10:03
 */
public class CollectionsTest {
    public static void main(String[] args) {
        ArrayList objects = new ArrayList();
        objects.add(312);
        objects.add(789);
        objects.add(456);
        objects.add(123);
        System.out.println(objects);
        //reverse()翻转
        Collections.reverse(objects);
        System.out.println(objects);
        //shuffle()随机排序
        Collections.shuffle(objects);
        //sort(List list)按升序排序 sort(List list,Comparator):按定制的Comparator排序
        Collections.sort(objects);
        //swap(List list,int,int)交换
        //Object max(Collection):根据元素的自然顺序，返回最大值
        //Object max(Collection,Comparator):根据定制排序，返回最大值
        //Object min(Collection)
        //Object min(Collection,Comparator):根据定制排序，返回最小值
        //int frequency(Collection,Object):返回指定元素出现的次数

        //void copy(List dest,List src):将src复制到dest中，dest的size需大于等于src的size，否则报错
        // List dest = Arrays.asList(new Object[src.size]);

        //boolean replaceAll(List list,Object oldVal,Object newVal),新值替换旧值

        //Collections类提供了多个synchronizedXxx方法，该方法可使将指定集合包装成线程同步的集合，
        // 从而解决多线程并发访问集合时的线程安全问题。
        //返回的list即为线程安全的List
        List list = Collections.synchronizedList(objects);
    }
}
