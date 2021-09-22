package com.atguigu.java;

import java.io.Serializable;

/**
 * @author shkstart
 * @create 2021-09-07 17:40
 */
public class Person implements Serializable {

    public static final long serialVersionUID = 45454545354L;

    private String name;
    private int age;
    private double hair;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
