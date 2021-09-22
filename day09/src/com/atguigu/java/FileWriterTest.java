package com.atguigu.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author shkstart
 * @create 2021-09-03 15:00
 * file对应的硬盘中的文件如果不存在，在输出的过程中，会自动创建文件
 * file对应的硬盘中的文件如果存在
 *      如果使用的构造器是FileWriter(file,false)/FileWriter(file),会覆盖原有的文件
 *      如果使用的构造器是FileWriter(file,true)：不会覆盖原有的文件，而是在原有基础上修改
 *
 *
 */
public class FileWriterTest {
    public static void main(String[] args)  {
        FileWriter fileWriter = null;
        try {
            File file1 = new File("D:\\idea_code\\project01\\day09\\hello1.txt");
        //    File file = new File("D:\\idea_code\\project01\\day09\\hello.txt");


         //   fileWriter = new FileWriter(file,true);
            fileWriter = new FileWriter(file1,true);
              //!!!!!!!!!! .write()      //////////
            fileWriter.write("hello1111111,");


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
