package com.atguigu.java;

import java.io.File;
import java.io.IOException;

/**
 * @author shkstart
 * @create 2021-09-02 14:48
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\f1.txt");
        System.out.println("创建文件"+f1.createNewFile());
        File file = new File("D:\\fileTest");
        System.out.println("创建单层文件夹"+file.mkdir());
    }
}
