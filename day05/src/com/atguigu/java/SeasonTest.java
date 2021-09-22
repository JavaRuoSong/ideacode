package com.atguigu.java;

/**
 * @author shkstart
 * @create 2021-08-26 10:25
 */
public class SeasonTest {
    public static void main(String[] args) {
        Season1 summer = Season1.SUMMER;
        //
        System.out.println(summer.toString());//SUMMER
        //
        System.out.println(Season1.class.getSuperclass());//class java.lang.Enum
        //values()方法
        Season1[] values = Season1.values();
        for (int i = 0; i <values.length ; i++) {
            System.out.println(values[i]);
        }

        Thread.State[] values1 = Thread.State.values();
        for (int i = 0; i <values1.length ; i++) {
            System.out.println(values1[i]);
        }
        //valueOf(String objName) :返回跟objName同名的枚举类对象，找不到报异常
        // Season1 winter = Season1.valueOf("WINTER");
        Season1 winter = Season1.valueOf("WINTER1");
        System.out.println(winter);
    }

}

/*
* Enum类常用方法
* values()
* valueOf()
* toString()
*
*使用enum关键字定义的枚举类实现接口的情况
* 情况一：时间接口，在enum类中实现抽象方法
* 情况二：让枚举类的对象分别实现接口中的抽象方法
*
*
* */




//使用enum关键字定义枚举类，默认继承Enum类

enum  Season1  {
    //1.提供枚举类的多个对象,多个对象之间用逗号隔开，末尾对象分号结束
    SPRING("春天","3-5"),
    SUMMER("夏天","6-8"),
    AUTUMN("秋天","9-11"),
    WINTER("冬天","12-2");
    //1.声明season对象的属性
    private final String seasonName;
    private final String seasonDesc;



    //2.私有化类的构造器！防止实例化增加对象个数
    private Season1(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    //3.其他诉求：获取属性

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }


    //提供toString()

//    @Override
//    public String toString() {
//        return "Season1{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }

}