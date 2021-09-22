package com.atguigu.java;

import java.io.*;

/**
 * @author shkstart
 * @create 2021-09-03 20:24
 */
public class PictureTest {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\idea_code\\project01\\day09\\java类加载机制.png");
        File dest = new File("D:\\idea_code\\project01\\day09\\java类加载机制dest.png");
        FileInputStream InputStream = new FileInputStream(src);
        FileOutputStream OutputStream = new FileOutputStream(dest);
        int len;
        byte[] bytes = new byte[500];
        while((len = InputStream.read(bytes)) != -1){
            OutputStream.write(bytes,0,len);
        }
        InputStream.close();
        OutputStream.close();
    }
}
