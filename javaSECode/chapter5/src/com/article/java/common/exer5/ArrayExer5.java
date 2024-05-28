package com.article.java.common.exer5;

import java.util.Arrays;

/**
 * @projectName: JavaProjectCode
 * @package: com.article.java.common.exer5
 * @className: ArrayExer5
 * @author: 拾叁拾玖
 * @description: TODO
 * @date: 2024/5/10 下午4:56
 * @version: 1.0
 */
public class ArrayExer5 {
    public static void main(String[] args) {
//        案例：
//        定义数组：int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
//        如何实现数组元素的反转存储？你有几种方法。
        int[] arr = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
        System.out.println("反转前：" + Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("反转后：" + Arrays.toString(arr));
    }
}
