package com.atguigu.exer;

/**
 * @author shkstart
 * @create 2021-08-22 21:01
 */
class Fan {
    public static String FanZhuan(String str,int i,int j) {
        char[] chars = str.toCharArray();
        char a;
        for ( ;i  <j +1; i++) {
             a = chars[i];
             chars[i] = chars[j];
             chars[j] = a;
        }
        String s = new String(chars);
        return s;
    }
}

public class Exer1 {
    public static void main(String[] args) {
        String a = Fan.FanZhuan("abcdefg", 1, 2);
        System.out.println(a);
    }
}
