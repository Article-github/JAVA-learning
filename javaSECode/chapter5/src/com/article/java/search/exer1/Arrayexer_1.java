package com.article.java.search.exer1;

import java.util.Arrays;

/**
 * @projectName: JavaProjectCode
 * @package: com.article.java.search.exer1
 * @className: Arrayexer
 * @author: 拾叁拾玖
 * @description: TODO
 * @date: 2024/5/11 上午8:26
 * @version: 1.0
 */
public class Arrayexer_1 {
    public static void main(String[] args) {
//        案例：数组的缩容：
//
//        现有数组 int[] arr={1,2,3,4,5,6,7}。现需删除数组中索引为4的元素。
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (i < 4) {
                newArr[i] = arr[i];
            } else {
                newArr[i - 1] = arr[i];
            }
        }
        arr = newArr;
        System.out.println(Arrays.toString(arr));
    }
}
