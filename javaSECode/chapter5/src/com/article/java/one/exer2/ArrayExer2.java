/*
 * Copyright (c) 周文璋 2024. 适度编码益脑，沉迷编码伤身，合理安排时间，享受快乐生活。
 */

package com.article.java.one.exer2;

import java.util.Scanner;

/**
 * @projectName: javaSECode
 * @package: com.article.java.one.exer2
 * @className: ArrayExer2
 * @author: 拾叁拾玖
 * @description: TODO
 * @date: 2024/4/23 12:54
 * @version: 1.0
 */
public class ArrayExer2 {
    public static void main(String[] args) {
        String[] arr = {"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字（1-7）:");
        int day = scanner.nextInt();
        if (day < 1 || day > 7) {
            System.out.println("输入有误");
        } else {
            System.out.println(arr[day - 1]);
        }
        scanner.close();
    }
}
