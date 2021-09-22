package com.atguigu.java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author shkstart
 * @create 2021-09-07 17:27
 */
public class Test1 {
    public static void main(String[] args) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new FileOutputStream("D:\\idea_code\\project01\\day011\\src\\com\\atguigu\\java\\object.dat"));

            oos.writeObject(new String("祝天下所有的情侣都是失散多年的兄妹"));


            //实现了Serializable或Externalizable接口的类且所有属性都是可序列化的才可以序列化
            //当前类提供一个全局常量serialVersionUID
            oos.writeObject(new Person("耿怡",21));


            oos.flush();//刷新缓冲区

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
