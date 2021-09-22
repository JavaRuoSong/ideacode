package com.atguigu.exer;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author shkstart
 * @create 2021-08-29 14:10
 */
public class ListTest1 {
    public static void main(String[] args) {
        //!!!!!!!!!!!!!      hashCode决定位置，equals()决定内容    添加时先哈希后equals   ！！！！！！！！！！！！！！
        HashSet hashSet = new HashSet();
        person p1 = new person("tom", 12);
        person p2 = new person("jerry", 21);

        hashSet.add(p1);
        hashSet.add(p2);

        p1.name = "mary";
//        p1.name = "tom";

        hashSet.remove(p1);//因为将p1的name修改为了"mary",所以remove时p1的hashCode与修改前的不同，所以计算出来的hash值代表的位置上为空，删除失败
        System.out.println(hashSet);
        hashSet.add(new person("tom",12));//尽管此次添加的位置（哈希值）与p1相同，但是，equals方法比较的内容不同，仍然可以添加
        System.out.println(hashSet);
        hashSet.add(new person("mary",12));//"mary"，12 计算出的哈希值位置没有添加过对象，可以添加成功
        System.out.println(hashSet);


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
//        System.out.println("调用了equals方法");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
//        System.out.println("调用了hashCode方法");
        return Objects.hash(name, age);
    }


}