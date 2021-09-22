package exer9_2;

import java.util.HashSet;
import java.util.Set;

/**
 * @author shkstart
 * @create 2021-09-02 23:14
 */
public class minSameString {
    //寻找相同的字符
    static void findMinString(String s1, String s2) {
        Set set = new HashSet();

        for (int i = 0; i < s2.length(); i++) {
            if (s1.contains(s2.substring(i, i + 1))) {
                set.add(s2.substring(i, i + 1));
            }

        }
        System.out.println(set);
    }

    public static void main(String[] args) {
        String s1 = "abcdefg";
        String s2 = "bbbfffvvv";
        findMinString(s1,s2);
    }
}

