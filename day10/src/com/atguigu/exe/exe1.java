package com.atguigu.exe;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author shkstart
 * @create 2021-09-06 15:21
 */
//遍历文本中每个字符出现的次数，储存在map中
public class exe1 {
    public static void main(String[] args) throws IOException {
//        File file = new File("D:\\idea_code\\project01\\day10\\src\\com\\atguigu\\hello1.txt");
//        FileInputStream fin = new FileInputStream(file);
        Map<String, Integer> aChar = getChar("D:\\idea_code\\project01\\day10\\src\\com\\atguigu\\hello1.txt");
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(aChar.entrySet());

///////////////////////////
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
///////////////////

        System.out.println(list);

    }

    public static Map<String, Integer> getChar(String path) throws IOException {
        HashMap<String, Integer> map = new HashMap()

        ;
        File file = new File(path);
//        BufferedInputStream bfin = new BufferedInputStream(new FileInputStream(file));
        FileReader fileReader = new FileReader(file);
        char[] chars = new char[1];

        while (fileReader.read(chars) != -1 ){
            if(map.containsKey(String.valueOf(chars[0]))){
                int count = map.get(String.valueOf(chars[0])) + 1;
                map.put(String.valueOf(chars[0]),count);
            }
            else {
                map.put(String.valueOf(chars[0]),1);
            }

        }

        return map;
    }
}
