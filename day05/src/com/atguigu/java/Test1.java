package com.atguigu.java;

/**
 * @author shkstart
 * @create 2021-08-25 17:40
 * <p>
 * java对象比较大小 需实现Comparable（自然排序）,
 * Comparator（定制排序）两个接口中的任意一个。
 *   重写compareTo(obj)当前对象大返回正整数，小返回负整数，相等返回0，
 *   compare(obj1，obj2)方法
 *   两种方式比较：
 *      Comparable接口的方式一旦一定，保证Comparable接口实现类的对象在任何位置都可以比较大小
 *      Comparator接口属于临时性的比较
 */
 public class Test1 {
    public static void main(String[] args) {
        //Comparable
        //Comparator

    }
}/*

枚举类：类的对象只有有限个，确定的
    例如：星期
          性别
          季节
          支付方式
          就职状态
          订单状态
          线程状态
！！当需要定义一组常量时，强烈建议使用枚举类
1.枚举类只有一个对象时，可以作为单例模式的实现方式






*/
//定义一个枚举类
//方式一：jdk5.0之前 自定义枚举类
//方式二：使用enum关键字自定义枚举类
class  Season{
    //1.声明season对象的属性
    private final String seasonName;
    private final String seasonDesc;



        //2.私有化类的构造器！防止实例化增加对象个数
    private Season(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    //3.提供枚举类的多个对象:public static final
    public static final Season SPRING = new Season("春天","3-5");
    public static final Season SUMMER = new Season("夏天","6-8");
    public static final Season AUTUMN = new Season("秋天","9-11");
    public static final Season WINTER = new Season("冬天","12-2");
    //4.其他诉求：获取属性

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    //提供toString()

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}


























