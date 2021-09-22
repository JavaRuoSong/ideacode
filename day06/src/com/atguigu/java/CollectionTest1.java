package com.atguigu.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author shkstart
 * @create 2021-08-28 13:04
 */
/*
* iterator对象称为迭代器
*
*
*
*
* */
public class CollectionTest1 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add(123);
        c1.add(new String("hahaha"));
        c1.add(456);
        c1.add(new person("tom",12));
//        Iterator i = new Iterator() {
//            @Override
//            public boolean hasNext() {
//                return false;
//            }
//
//            @Override
//            public Object next() {
//                return null;
//            }
//        }
        //实例化
        Iterator iterator = c1.iterator();
        //遍历，方式一
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
        //方式二 不推荐
//        for (int i = 0; i <c1.size() ; i++) {
//            System.out.println(iterator.next());
//        }
        //方式三 推荐 hasNext(); 判断是否还有下一个元素
        while(iterator.hasNext()){//如果还有next 进入循环
            System.out.println(iterator.next());
        }
        while(iterator.hasNext()){
            Object o = iterator.next();
            if("456"==o){
                iterator.remove();
            }
        }
    }
}
