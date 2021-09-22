package com.atguigu.java;

import java.io.*;

/**
 * @author shkstart
 * @create 2021-09-06 14:44
 */
public class BufferedStream {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\idea_code\\project01\\day10\\src\\java内部类.png");
        File file1 = new File("D:\\idea_code\\project01\\day10\\src\\java内部类buffer.png");

        BufferedInputStream bfin = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bfout = new BufferedOutputStream(new FileOutputStream(file1));
        long start = System.currentTimeMillis();
        int len;
        byte[] bytes = new byte[10];
        while ((len = bfin.read(bytes)) != -1){
            bfout.write(bytes,0,len);
        }
        bfin.close();
        bfout.close();
        long end = System.currentTimeMillis();
        System.out.println("时间为"+(end - start));//11

    }
}
