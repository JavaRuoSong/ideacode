package com.atguigu.java1;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author shkstart
 * @create 2021-09-12 9:33
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        //对于自定义类，使用系统类加载器进行加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);
        //调用系统类加载器的getParent():获取拓展类加载器
        ClassLoader classLoader1 = classLoader.getParent();
        System.out.println(classLoader1);
        //调用拓展类加载器的getParent():无法获取引导类加载器
        //引导类加载器主要加载java的核心类库，无法加载自定义类。
        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println(classLoader2);

        Class<? extends Class> aClass = String.class.getClass();
        System.out.println(aClass);

        //


    }
    @Test
    public void Test(){
        Class<Person> clazz = Person.class;
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field f:declaredFields){
            //1.权限修饰符
            int modifiers = f.getModifiers();
            System.out.println(Modifier.toString(modifiers));

            //2.数据类型
            Class<?> type = f.getType();
            System.out.println(type.getName());
            //3.变量名
            String name = f.getName();
            System.out.println(name);

            System.out.println();
      //      System.out.println(f);
        }

    }
    @Test
    public void test1(){
        Class<Person> pClass = Person.class;
        Method[] methods = pClass.getDeclaredMethods();
        for(Method m:methods){
            System.out.print(Modifier.toString(m.getModifiers())+"\t");//权限修饰符


            System.out.print(m.getReturnType().getName()+"\t");//返回值类型


            System.out.println(m.getName()+"");//方法名


        }
   //     Path
    }
}
