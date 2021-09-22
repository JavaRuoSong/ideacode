package com.atguigu.java1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author shkstart
 * @create 2021-09-09 15:52
 */
public class ServerSocketTest {
    public static void main(String[] args)  {
        ServerSocket ss = null;
        Socket socket = null;
        InputStream is = null;
        OutputStream outputStream = null;
        try {
            ss = new ServerSocket(8899);

            socket = ss.accept();

            is = socket.getInputStream();
            outputStream = new FileOutputStream("图片.png");
            //     InputStreamReader inputStreamReader = new InputStreamReader(is);

            byte[] bytes = new byte[10];
            //    char[] chars = new char[5];
            int len;
            while ((len = is.read(bytes))!=-1){
                outputStream.write(bytes,0,len);

            }
            OutputStream outs = socket.getOutputStream();
            outs.write("我已收到".getBytes());


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                ss.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
