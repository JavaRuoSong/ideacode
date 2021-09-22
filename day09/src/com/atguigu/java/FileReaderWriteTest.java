package com.atguigu.java;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author shkstart
 * @create 2021-09-03 13:54
 */
public class FileReaderWriteTest {
    public static void main(String[] args) {
        /*将day09下的txt文件读入到程序中，并输出到控制台
        说明：
            1.read()理解：返回度入的一个字符。如果到达文件末尾，返回-1
            2.异常的处理：为了保证流资源一定可以执行关闭操作。需要使用try--catch--finally处理
            3.读入的文件一定要存在，否则就会报FileNotFoundException


        * */
        FileReader fileReader = null;
        try {
            //1.实例化，指明要操作的对象
            File file = new File("D:\\idea_code\\project01\\day09\\hello.txt");
            //2.提供具体的流
            fileReader = new FileReader(file);

            //3.数据的读入
            //read(),返回一个读入的字符。如果到达文件末尾，返回-1
//        int read = fileReader.read();
//        while(read != -1){
//            System.out.print((char)read);
//            read = fileReader.read();
//        }
            //方式一：
//            int date;
//            while ((date = fileReader.read()) != -1) {
//                System.out.println(date);
//            }

            //方式二：
//            char[] char1 = new char[5];
//            int read;
//           // int read = fileReader.read(char1);
//            while ((read = fileReader.read(char1)) != -1) {
//                for (int i = 0; i < read; i++) {
//                    System.out.print(char1[i]);
//
//                }
//            }
            //方式三：用String
            char[] char1 = new char[5];
            int read;
            // int read = fileReader.read(char1);
            while ((read = fileReader.read(char1)) != -1) {
                String s = new String(char1,0,read);
                System.out.print(s);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            //4.流的关闭操作\
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
