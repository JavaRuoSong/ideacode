package com.atguigu.java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * @author shkstart
 * @create 2021-08-24 12:11
 */
public class DateTimeFormateTest {
    public static void main(String[] args) {
        //DateTimeFormatTest:格式化日期或时间类似于SimpleDateFormat
        //自定义格式
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        //格式化
        String format = dateTimeFormatter.format(LocalDateTime.now());
        System.out.println(format);//2021-08-24 12:28:01
        TemporalAccessor parse = dateTimeFormatter.parse("1988-06-30 11:36:05");
        System.out.println(parse);


    }
}
