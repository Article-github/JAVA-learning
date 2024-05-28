package com.article.java.common.exer1;

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
public class ArrayExer1 {
    public static void main(String[] args) {
//        案例：定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，然后求出所有元素的最大值，最小值，总和，平均值，
//        并输出出来。
//
//        要求：所有随机数都是两位数：[10,99]
//        提示：求[a,b]范围内的随机数： (int)(Math.random() * (b - a + 1)) + a;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (99 - 10 +1)) +10;
        }
        System.out.println("数组元素：" + Arrays.toString(arr));
        //求最大值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大值："+max);
        //求最小值
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("最小值："+min);
        //求总和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("总和："+sum);
        //求平均值
        double avg = (double) sum / arr.length;
        System.out.println("平均值："+avg);
    }
}
