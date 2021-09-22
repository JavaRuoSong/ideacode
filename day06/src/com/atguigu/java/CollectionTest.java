package com.atguigu.java;


import java.util.*;

/**
 * @author shkstart
 * @create 2021-08-27 20:55
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection coll = new LinkedList();
        coll.add("sss");
        coll.add("sas");
        coll.add(new java.lang.String("tom"));
        person p = new person("tom",12);
        coll.add(p);
        //contains(Object obj):判断集合中是否包含obj  判断时会调用obj所在对象的equals方法
        System.out.println(coll.contains("sss"));
        System.out.println(coll.contains(p));//
        System.out.println(coll.contains(new java.lang.String("tom")));

        //containsAll:判断形参中的所有元素是否包含在集合中(判断是否是子集)
        Collection coo = Arrays.asList(123, 465, "sas");
        boolean b = coll.containsAll(coo);
        System.out.println(b);
        //remove():移除
        coll.remove(p);

        //removeAll(Collection coo):移除coll1中的元素（移除交集，求差集）修改当前集合
       // coll.removeAll(coo);


        //retainAll(Collection coo):交集，获取当前集合和coo的交集，并返回到当前集合
        coll.retainAll(coo);
        System.out.println(coll);
        //hashCode():返回当前对象的哈希值
        System.out.println(coll.hashCode());
        //集合-->数组 toArray();
        coll.toArray();

        //数组-->集合
        List<int[]> arr1 = Arrays.asList(new int[]{13, 46});
        System.out.println(arr1);

        List ints = Arrays.asList(new int[]{123, 456});
        List ints1 = Arrays.asList(new Integer[]{123, 456});
        System.out.println(ints.size());//1
        System.out.println(ints1.size());//2

    }
}
class person {
    String name;
    int age;
//    public person(String name,int age){
//
//
//    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("调用了equals方法");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        System.out.println("调用了hashCode方法");
        return Objects.hash(name, age);
    }


}