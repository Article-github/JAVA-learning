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
public class Arrayexer {
    public static void main(String[] args) {
//        案例1：数组的扩容:
//
//        现有数组 int[] arr = new int[]{1,2,3,4,5};
//        现将数组长度扩容1倍，并将10,20,30三个数据添加到arr数组中，如何操作？
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] newArr = new int[arr.length * 2];
        System.arraycopy(arr, 0, newArr, 0, arr.length);//拷贝、扩容数组
        newArr[5] = 10;
        newArr[6] = 20;
        newArr[7] = 30;
        arr = newArr;
        System.out.println( Arrays.toString(arr));
    }
}
