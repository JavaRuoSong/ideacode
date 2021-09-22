package com.atguigu.exer;



/**
 * @author shkstart
 * @create 2021-08-23 13:25
 */
class Times {

    public static int getTimes(String str, String s) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(s,index)) != -1){
           index += s.length();
           count++;
        }
        return count;
    }

}




public class exer1 {
    public static void main(String[] args) {
        System.out.println(Times.getTimes("aaaaaaabcbvbc", "cbvbbbbbbbbbbbbbbbbbbbbbbb"));
        String s1 = "sssss";
        System.out.println(s1.substring(1));

    }
}
