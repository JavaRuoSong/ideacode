package com.atguigu.java1;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author shkstart
 * @create 2021-09-09 15:46
 */
public class SocketTest {
    public static void main(String[] args)  {
        Socket socket = null;
        OutputStream os = null;
        try {
            //
            socket = new Socket(InetAddress.getByName(""),8899);
            //
            os = socket.getOutputStream();
                     //////           //////
 //           os.write("你好".getBytes());
            FileInputStream fin = new FileInputStream("C:\\Users\\Administrator\\Desktop\\java内部类.png");

            int len;
            byte[] bytes = new byte[20];
            while ((len = fin.read(bytes))!=-1){
                os.write(bytes,0,len);
            }
            socket.shutdownOutput();

            InputStream ins = socket.getInputStream();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] bytes1 = new byte[50];
            int len1;
            while ((len1 = ins.read(bytes1))!=-1){
                baos.write(bytes1,0,len1);
            }
            System.out.println(baos.toString());


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
