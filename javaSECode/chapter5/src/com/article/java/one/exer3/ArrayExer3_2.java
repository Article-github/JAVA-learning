/*
 * Copyright (c) 周文璋 2024. 适度编码益脑，沉迷编码伤身，合理安排时间，享受快乐生活。
 */

package com.article.java.one.exer3;

import java.util.Scanner;

/**
 * &#064;projectName:  javaSECode
 * &#064;package:  com.article.java.one.exer3
 * &#064;className:  ArrayExec3
 * &#064;author:  拾叁拾玖
 * &#064;description:  TODO
 * &#064;date:  2024/4/23 12:59
 * &#064;version:  1.0
 */
public class ArrayExer3_2 {
    public static void main(String[] args) {
//        案例：学生考试等级划分
//        从家农安读入学生成绩，找出最高分，并输出学生成绩等级。
//        成绩>=最高分-10  等级为'A'
//        成绩>=最高分-20  等级为'B'
//        成绩>=最高分-30  等级为'C'
//        其余            等级为'D'
//        1.首先从键盘获取学生人数
        System.out.print("请输入学生人数：");
        Scanner scanner = new Scanner(System.in);
        int studentNum = scanner.nextInt();
        int[] scores = new int[studentNum];

//        2.将成绩保存在数组中
        int maxScores = scores[0];
        System.out.println("请输入" + studentNum + "个学生的成绩：");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
            //        3.获取学生成绩最大值
            if (maxScores < scores[i]) {
                maxScores = scores[i];
            }
        }
        System.out.println("最高分是：" + maxScores);
//        4.遍历数组元素，根据学生成绩与最高分的差值，得到每个学生成绩的等级，并输出成绩和等级。
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= maxScores - 10) {
                System.out.println(i + "号" + "学生成绩是：" + scores[i] + "等级是：A");
            } else if (scores[i] >= maxScores - 20) {
                System.out.println(i + "号" + "学生成绩是：" + scores[i] + "等级是：B");
            } else if (scores[i] >= maxScores - 30) {
                System.out.println(i + "号" + "学生成绩是：" + scores[i] + "等级是：C");
            } else {
                System.out.println(i + "号" + "学生成绩是：" + scores[i] + "等级是：D");
            }
            scores.clone();
        }
    }
}
