package com.atguigu.java1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author shkstart
 * @create 2021-09-09 14:05
 */
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress byName = InetAddress.getByName("www.atguigu.com");
            System.out.println(byName);
            InetAddress byName1 = InetAddress.getByName("127.0.0.1");
            System.out.println(byName1);
            InetAddress byName2 = InetAddress.getByName("www.bilibili.com");
            System.out.println(byName2);
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost);



        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
