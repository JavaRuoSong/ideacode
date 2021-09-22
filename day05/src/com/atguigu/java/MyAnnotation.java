package com.atguigu.java;

/**
 * @author shkstart
 * @create 2021-08-26 13:14
 */
//跟接口没有任何关系
public @interface MyAnnotation {
    String value() default "hello";//使用default关键字设置默认值
}
