package com.atguigu.java;

/**
 * @author shkstart
 * @create 2021-08-26 12:58
 * jdk内置注解
 * @override 重写的方法
 * @Deprecated  过时的
 * @SuppressWarnings    抑制编译器警告
 *
 *
 * 自定义注解
 * 参照SuppressWarnings
 * 声明为@interface
 * 内部定义成员，通常使用value表示
 * 可以使用default定义默认值
 * 如果自定义注解没有成员，则表示标识作用
 * ！！如果注解有成员，使用注解时，需要指明成员的值
 *
 * jdk中的四种 元注解(mete-)：修饰注解的注解、
 *@Retention :指定所修饰的Annotation的生命周期：SOURCE/CLASS（默认行为）/RUNTIME
 *              只有声明为RUNTIME的声明周期注解，才能通过反射获取。
 *
 *@Target：
 *@Documented：
 *@Inherited：
 *
 *
 *
 *
 *
 *
 */
public class ZhujieTest {
}
@MyAnnotation(value="hello")
class person{
   public void walk(){}
}
class stu extends person{
    @Override
    public void walk() {

    }

}