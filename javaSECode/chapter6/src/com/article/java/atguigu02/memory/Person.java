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

public class Person {
    //属性
    String name;//姓名
    int age;//年龄
    char gender;//性别


    //方法
    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep(int hour) {
        System.out.println("人每天至少保持" + hour + "小时睡眠");
    }

    public void interests(String hobby) {
        System.out.println("我的爱好是:" + hobby);
    }
}

