package com.article.java.two.exer1;

/**
 * @projectName: JavaProjectCode
 * @package: com.article.java.two.exer1
 * @className: ArrayExer
 * @author: 拾叁拾玖
 * @description: TODO
 * @date: 2024/5/8 下午5:05
 * @version: 1.0
 */
public class ArrayExer {
    public static void main(String[] args) {
        //静态初始化数组
        int[][] arr = new int[][]{{3,5,8},{12,9},{7,0,6,4}};
        int sum = 0;//记录元素总和
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("元素总和为：" + sum);
    }
}
