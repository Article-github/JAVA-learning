package com.article.java.common.exer2;

import java.util.Arrays;

/**
 * @projectName: JavaProjectCode
 * @package: com.article.java.common.exer1
 * @className: ArrayExer1
 * @author: 拾叁拾玖
 * @description: TODO
 * @date: 2024/5/8 下午6:48
 * @version: 1.0
 */
public class ArrayExer2 {
    public static void main(String[] args) {
//        案例：评委打分
//
//        分析以下需求，并用代码实现：
//
//（1）在编程竞赛中，有10位评委为参赛的选手打分，分数分别为：5,4,6,8,9,0,1,2,7,3
//
//（2）求选手的最后得分（去掉一个最高分和一个最低分后其余8位评委打分的平均值）
        int[] scores = {5, 4, 6, 8, 9, 0, 1, 2, 7, 3};
        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        for (int score : scores) {
            sum += score;
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }
        }
        double sun = (double) (sum-max-min) / (scores.length - 2);
        System.out.println("总分 = " + sum);
        System.out.println("最高分 = " + max);
        System.out.println("最低分 = " + min);
        System.out.println("平均分 = " + sun);
    }
}
