package com.article.java.atguigu02.memory;

/**
 * @projectName: JavaProjectCode
 * @package: com.article.java.Arrays
 * @className: ArraySTest
 * @author: 拾叁拾玖
 * @description: TODO
 * @date: 2024/5/16 上午9:58
 * @version: 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        //创建对象
        Person p1 = new Person();

        //通过对象调用方法、属性
        p1.name = "拾叁拾玖";
        p1.age = 18;
        p1.gender = '男';
        System.out.println("姓名： " + p1.name + "年龄：" + p1.age + "性别：" + p1.gender);
        p1.eat();
        p1.sleep(8);
        p1.interests("跑步");
        //创建第二个对象
        Person p2 = new Person();
        p2.name = "李师师";
        p2.age = 18;
        p2.gender = '女';
        System.out.println("姓名： " + p2.name + "年龄：" + p2.age + "性别：" + p2.gender);
        p2.eat();
        p2.sleep(8);
        p2.interests("唱跳");
    }
}
