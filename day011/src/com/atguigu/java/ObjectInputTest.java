package com.atguigu.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author shkstart
 * @create 2021-09-07 17:11
 */
public class ObjectInputTest {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        FileOutputStream fos = null;
        try {
            ois = new ObjectInputStream(
                            new FileInputStream("D:\\idea_code\\project01\\day011\\src\\com\\atguigu\\java\\病例.txt"));
             fos = new FileOutputStream("D:\\idea_code\\project01\\day011\\src\\com\\atguigu\\java\\病例1.txt");
            int len;
            byte[] bytes = new byte[10];
            while ((len = ois.read(bytes))!=-1){
                fos.write(bytes,0,len);

            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
