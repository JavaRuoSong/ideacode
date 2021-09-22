package com.atguigu.java;

import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;

/**
 * @author shkstart
 * @create 2021-08-25 16:41
 *
 *
 *
 *Instance类似于java.util.date类
 *
 *日期时间格式化类：DateTimeFormatter
 * 格式化或解析日期，时间
 * 类似于SimpleDateFormat
 *  自定义格式：ofPattern("yyyy-MM-dd hh:mm:ss");
 *      format(TemporalAccessor t);格式化一个日期，，时间，返回一个字符串
 *      parse(CharSequence);将指定格式的字符序列解析为一个日期，时间
 *
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        Person[] p = new Person[5];
        p[0] = new Person("a三");
        p[1] = new Person("b二");
        p[2] = new Person("z六");
        p[3] = new Person("q五");
        p[4] = new Person("l四");
        Arrays.sort(p);
        System.out.println(Arrays.toString(p));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
        Date parse = (Date) dtf.parse("2021");
       // TemporalAccessor
       // CharSequence
    }
}

class Person implements Comparable {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Person) {
            Person p1 = (Person) o;
        }
            int i = this.name.compareTo(((Person) o).name);
            return i;


    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
