package com.atguigu.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author shkstart
 * @create 2021-09-06 15:03
 */
public class FileStream {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\idea_code\\project01\\day10\\src\\java内部类.png");
        File dest = new File("D:\\idea_code\\project01\\day10\\src\\java内部类file.png");
        FileInputStream InputStream = new FileInputStream(src);
        FileOutputStream OutputStream = new FileOutputStream(dest);
        long start = System.currentTimeMillis();
        int len;
        byte[] bytes = new byte[10];
        while((len = InputStream.read(bytes)) != -1){
            OutputStream.write(bytes,0,len);
        }
        InputStream.close();
        OutputStream.close();
        long end = System.currentTimeMillis();
        System.out.println("时间为"+(end - start));//457
    }
}
