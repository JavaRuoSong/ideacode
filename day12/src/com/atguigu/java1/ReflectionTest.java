package com.atguigu.java1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author shkstart
 * @create 2021-09-11 12:33
 *
 *关于java.lang.Class类的理解
 * 1.类的加载过程
 *  程序经过java.exe命令以后，会生成一个或多个字节码文件。
 *  接着使用java.exe命令对某个字节码文件进行解释运行。相当于将某个字节码文件加载到内存中。
 *  此过程就称为类的加载。加载到内存中的类，我们就称为运行时类。次运行时类，就作为Class的
 *  一个实例。
 * 2.换句话说，Class的实例就对应着一个运行时类。
 *

 *
 */
public class ReflectionTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException, ClassNotFoundException {
//        int a = 0;
//        double b = 1;
//        for (a = 0; a <22 ; a++) {
//            b = b/2;
//        }
//        System.out.println(b);
        //通常
        Person person = new Person("张三", 21);

        person.age = 26;

        System.out.println(person.toString());

        //使用反射

        //获取类
        Class<Person> personClass = Person.class;
        //获取构造器
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        //实例化对象
        Person tom = constructor.newInstance("Tom", 21);
        System.out.println(tom.toString());

        //获取属性
        Field age = personClass.getField("age");
        //修改
        age.set(tom,25);
        System.out.println(tom.toString());

        //通过类获取方法
        Method eat = personClass.getDeclaredMethod("eat");
        //调用eat方法
        System.out.println(eat.invoke(tom));

        System.out.println("***********************");


        //获取私有属性
        Constructor<Person> cons1 = personClass.getDeclaredConstructor(String.class);
        //设置setAccessible
        cons1.setAccessible(true);
        //实例化
        Person jerry = cons1.newInstance("jerry");

        System.out.println(jerry);

/*
* 获取Class实例的方式
* */
        //方式一：调用运行时类的属性
        Class<Person> personClass1 = Person.class;
        System.out.println(personClass1);
        //方式二：通过运行时类的对象，调用getClass()
        Person person1 = new Person();
        Class<? extends Person> aClass = person1.getClass();
        System.out.println(aClass);
        //方式三：调用Class的静态方法：forName(String classPath)
        Class<?> aClass1 = Class.forName("com.atguigu.java1.Person");
        System.out.println(aClass1);
        //
        System.out.println(personClass1 == aClass1);//true 地址值相同
        System.out.println(personClass1 == aClass);//true 地址值相同


        //getFields():获取当前运行时类声明为public的属性
        Field[] fields = personClass1.getFields();
        //获取当前运行时类的所有属性，不包含父类中的属性
        Field[] declaredFields = personClass1.getDeclaredFields();

//        System.out.println(fields.toString());
        for(Field f:declaredFields){
            System.out.println(f);
        }
    }

}
