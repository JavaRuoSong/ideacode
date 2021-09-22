package com.atguigu.java;

import java.util.Calendar;
import java.util.Date;

/**
 * @author shkstart
 * @create 2021-08-24 10:12
 */
public class calendarTest {
    public static void main(String[] args) {
        /*实例化Calender类
        * 方式一：创建其子类GregorianCalendar的对象
        *方式二：调用其中的静态方法，getInstance();
        *
        * */
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());//java.util.GregorianCalendar
        //常用方法
        //get()
        int i = calendar.get(Calendar.DAY_OF_MONTH);//24
        System.out.println(i);
        //set()
        calendar.set(Calendar.DAY_OF_MONTH,1);//1
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        //add()
        calendar.add(Calendar.DAY_OF_MONTH,6);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));//7
        //getTime():日历类--》Date
        Date time = calendar.getTime();
        System.out.println(time);//Sat Aug 07 10:25:29 CST 2021
        //setTime():Date-->日历类
        calendar.setTime(time);
        int i1 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(i1);


    }
}
