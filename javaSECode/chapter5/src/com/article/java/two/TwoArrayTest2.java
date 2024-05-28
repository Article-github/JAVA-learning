package com.article.java.two;

import java.util.Arrays;

/**
 * &#064;projectName:  JavaProjectCode
 * &#064;package:  com.article.java.two
 * &#064;className:  TwoArrayTest1
 * &#064;author:  拾叁拾玖
 * &#064;description:  TODO
 * &#064;date:  2024/5/7 下午3:59
 * &#064;version:  1.0
 */
public class TwoArrayTest2 {
    public static void main(String[] args) {
        //1.数组的声明与初始化
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        //方式1：静态初始化
        int[][] arr2 = new int[][]{{1, 2, 3, 4, 5}, {12, 23, 34, 45, 56}, {11, 22, 33, 44, 55}};
        //方式2：动态初始化
        int[][] arr3 = new int[3][5];
        double[][] arr4 = new double[3][];
        //2.数组元素的调用
        //针对于arr2来说，外层元素{1, 2, 3, 4, 5}, {12, 23, 34, 45, 56}, {11, 22, 33, 44, 55} 内层元素1, 2, 3, 4, 5, 12, 23, 34, 45, 56, 11, 22, 33, 44, 55
        //调用内层元素
        System.out.println(arr2[0][0]);//1
        System.out.println(arr2[1][2]);//34
        //调用外层元素
        System.out.println(Arrays.toString(arr2[0]));//[1, 2, 3, 4, 5]
        System.out.println(arr2[1]);//[I@4eec7777
        //测试arr3.arr4
        arr3[0][1] = 123;
        System.out.println(arr3[0][1]); //123
        System.out.println(arr3[0]);//[I@4eec7777
        arr4[0]=new double[4];
        arr4[0][0]= 1.0;
        System.out.println(arr4[0]);//[D@4eec7777
        System.out.println(arr4[0][0]);//1.0
        //3.数组的长度
        System.out.println(arr1.length);//5
        System.out.println(arr2[0].length);//5
        System.out.println(arr2[1].length);//5
        System.out.println(arr2[2].length);//5
        //4.如何遍历数组
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}

