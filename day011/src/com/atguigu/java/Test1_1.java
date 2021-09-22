package com.atguigu.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author shkstart
 * @create 2021-09-07 17:32
 */
public class Test1_1 {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(
                    "D:\\idea_code\\project01\\day011\\src\\com\\atguigu\\java\\object.dat"));

            Object o = ois.readObject();
            String s = (String)o;
            Person p = (Person) ois.readObject();


            System.out.println(s);
            System.out.println(p);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
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
