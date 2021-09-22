package com.atguigu.java2;

import java.io.File;

/**
 * @author shkstart
 * @create 2021-09-01 21:38
 * File类的使用
 * 1.File类的一个对象，代表一个文件或一个文件目录（俗称：文件夹）
 * 2.File类声明在java.io包下
 *
 *
 *
 *
 *
 *
 */
public class FileTest {
    /*
    1.创建File类的实例
    2.
     相对路径：相较于某个路径下，指明的路径
     绝对路径：包含盘符在内的文件或文件目录的路径

    * */
    public static void main(String[] args) {
        //构造器1
        //绝对路径：真实路径
        File file2 = new File("D："+File.separator//文件分隔符
                +"idea_code\\project01\\day07\\hello.txt");

        //构造器2
        File file3 = new File("D\\","javaSenior");

        //构造器3
        File file4 = new File(file3,"hi.txt");
        /*
        *
        * */
        //File的常用方法
        File file5 = new File("D:\\idea_code\\io\\hi.txt");
        //相对路径：相对于当前的module
        File file1 = new File("hello.txt");

        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(file1.lastModified());

        System.out.println();

        System.out.println(file5.getAbsolutePath());
        System.out.println(file5.getPath());
        System.out.println(file5.getName());
        System.out.println(file5.getParent());
        System.out.println(file5.length());
        System.out.println(file5.lastModified());

        File file = new File("D:\\eclipse_code");
        //
        String[] list = file.list();
        for(String s:list){
            System.out.println(s);
        }
        //
        File[] files = file.listFiles();
        for(File f:files){
            System.out.println(f);
        }
        /*
        * public boolean renameTo(File dest):把文件重命名为指定的文件路径
        *
        * */
        File file6 = new File("hello.txt");
        File file7 = new File("D:\\idea_code\\io");
        boolean b = file6.renameTo(file7);
        System.out.println(b);

    }

}






















