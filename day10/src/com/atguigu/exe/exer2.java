package com.atguigu.exe;

import java.io.*;

/**
 * @author shkstart
 * @create 2021-09-06 17:07
 */
public class exer2 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\idea_code\\project01\\day10\\src\\java内部类.png");
        File file1 = new File("D:\\idea_code\\project01\\day10\\src\\java内部类secret.jpg");


        FileInputStream fin = new FileInputStream(file);
        FileOutputStream fout = new FileOutputStream(file1);

        //转换流
        // 将输入的字节流转换为字符流
        //InputStreamReader inputStreamReader = new InputStreamReader(fin) 此时使用的是系统默认的字符集

        //转换编码格式

                //将输入的字节流转换为字符流
//        InputStreamReader inputStreamReader = new InputStreamReader(fin, "UTF-8");


//        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fout,"GBK");
//
            //读写过程
//        char[] chars = new char[20];
//        int len1;
//        while ( (len1 = inputStreamReader.read(chars))!=-1){
//            outputStreamWriter.write(chars,0,len1);
//        }


        int len ;
        byte[] bytes = new byte[1024];
        while( (len = fin.read(bytes)) != -1){
            //加密核心代码
            for (int i = 0; i <bytes.length ; i++) {
                bytes[i] = (byte) (bytes[i] ^ 5^5);
            }
            //
            fout.write(bytes,0,len);
        }
            //关闭
        fin.close();
        fout.close();



    }

}
