package com.atguigu.java;

import java.io.*;

/**
 * @author shkstart
 * @create 2021-09-03 15:16
 */
public class ReadWriteTest {
    public static void main(String[] args)  {

        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            File file = new File("D:\\idea_code\\project01\\day09\\hello.txt");
            File file1 = new File("D:\\idea_code\\project01\\day09\\hello2.txt");

            fileReader = new FileReader(file);
            fileWriter = new FileWriter(file1);

            int a;
            char[] chars = new char[5];
            while ((a = fileReader.read(chars)) !=-1){
                fileWriter.write(chars,0,a);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
