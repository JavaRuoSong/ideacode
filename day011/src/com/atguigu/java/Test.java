package com.atguigu.java;

import java.io.*;

/**
 * @author shkstart
 * @create 2021-09-07 9:30
 *
 * 对象流：
 *      序列化：ObjectOutputStream：将基本数据类型数据或对象写入到数据源中
 *      反序列化：ObjectInputStream：将基本数据类型或对象读取到内存中
 *      ！！不可以操作static或transient修饰的成员变量
 *
 *
 */
public class Test {
    public static void main(String[] args)  {
       // InputStreamReader,将输入的字节流变成字符流  解码
      //  OutputStreamWriter,将输出的字符流变成字节流。编码
       // ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        try {
         //   ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\病历1.txt"));
            FileInputStream fr = new FileInputStream("C:\\\\Users\\\\Administrator\\\\Desktop\\\\病历.txt");
            oos = new ObjectOutputStream(new FileOutputStream("D:\\idea_code\\project01\\day011\\src\\com\\atguigu\\java\\病例.txt"));

    //       Object o = ois.readObject();
            int len;
            byte[] bytes = new byte[10];
            while ((len = fr.read(bytes))!=-1){
                oos.write(bytes,0,len);
            }
            


       //     System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
            finally {
//            try {
//        //        ois.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }
    }
}
