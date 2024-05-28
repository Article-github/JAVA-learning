package com.article.java.atguigu01.oop;

/**
 * @projectName: JavaProjectCode
 * @package: com.article.java.Arrays
 * @className: ArraySTest
 * @author: 拾叁拾玖
 * @description: TODO
 * @date: 2024/5/16 上午9:58
 * @version: 1.0
 */
public class PhoneTest {
    public static void main(String[] args) {
        //创建Phone对象
        Phone phone = new Phone();
        //通过Phonr对象调用成员方法
        //格式：对象.方法名或者对象.属性名
        phone.name = "小米";
        phone.price = 1999;
        System.out.println("品牌名：" + phone.name + ", 价格：" + phone.price);
        //调用成员方法
        phone.call();
        phone.sendMessage("你好");
        phone.playGame();
    }
}
