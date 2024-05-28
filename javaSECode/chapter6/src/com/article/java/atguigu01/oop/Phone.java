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
public class Phone {
    //属性
    String name;
    double price;
    //方法
    public void call(){
        System.out.println("手机能打电话");
    }
    public  void sendMessage(String message){
        System.out.println("发送信息: " + message);
    }
    public void playGame(){
        System.out.println("手机能玩游戏");
    }
}
