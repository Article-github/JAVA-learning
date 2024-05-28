package com.article.java.search.exer3;

import java.util.Arrays;

/**
 * @projectName: JavaProjectCode
 * @package: com.article.java.search.exer3
 * @className: BubbleSortTest
 * @author: 拾叁拾玖
 * @description: TODO
 * @date: 2024/5/11 上午10:50
 * @version: 1.0
 */
public class BubbleSortTest {
//    案例1：使用冒泡排序，实现整型数组元素的排序操作
//
//    比如：int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
    public static void main(String[] args) {
        int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};//定义数组
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length-1 - i; j++) {
                int temp;
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
