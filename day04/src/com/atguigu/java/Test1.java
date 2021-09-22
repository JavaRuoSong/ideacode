package com.atguigu.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author shkstart
 * @create 2021-08-23 18:21
 */
public class Test1 {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sfd = new SimpleDateFormat();
        Date date = new Date();
        System.out.println(date);
        //日期==》字符串   ：格式化  通过sfd对象调用SimpleDateFormat中的 format()方法
        String format = sfd.format(date);
        System.out.println(format);
        //字符串--》日期   ：解析    通过sfd对象调用SimpleDateFormat中的 parse()方法
        String str = "20-8-25 上午11:20";
        Date parse = sfd.parse(str);
        System.out.println(parse);
        //
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = sdf1.format(date);
        System.out.println(format1);
        String s2 = "2021-08-23 19:01:22";
        Date parse1 = sdf1.parse(s2);
        System.out.println(parse1);

        /**将字符串日期转化为java.sql.Date :解析
         *java.sql.Date是java.util.Date的子类
         *
         *
         *
         * */
        String s1 = "2020-09-08";
        //实例化
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        //格式化为Date类型
        Date parse2 = sdf2.parse(s1);
        System.out.println(parse2);
        //转为java.sql.Date 调用构造器
        java.sql.Date date1 =new java.sql.Date(parse2.getTime());
        System.out.println(date1);

    }
}