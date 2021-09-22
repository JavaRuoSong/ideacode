package com.atguigu.exer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author shkstart
 * @create 2021-08-29 13:58
 */

public class ListTest {
    //
    public static List duplicateList(List list){
        HashSet hashSet = new HashSet();
        hashSet.addAll(list);
        return new ArrayList(hashSet);

    }
    //去除集合中的重复元素
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(123);
        list.add(123);
        list.add(465);
        list.add(546);
        list.add(465);
        List list1 = duplicateList(list);
        System.out.println(list1);
    }
}
