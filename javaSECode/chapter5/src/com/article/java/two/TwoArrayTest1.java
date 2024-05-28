package com.article.java.two;

/**
 * &#064;projectName:  JavaProjectCode
 * &#064;package:  com.article.java.two
 * &#064;className:  TwoArrayTest1
 * &#064;author:  拾叁拾玖
 * &#064;description:  TODO
 * &#064;date:  2024/5/7 下午3:59
 * &#064;version:  1.0
 */
public class TwoArrayTest1 {
    public static void main(String[] args) {
        //5.二维数组元素的默认初始化值
        int[][] arr = new int[3][4];
        //外层元素
        System.out.println(arr[1]);//[I@1b6d3586
        //内层元素
        System.out.println(arr[1][2]);//0

        boolean[][] arr1 = new boolean[4][5];
        //外层元素
        System.out.println(arr1[1]);//[Z@4554617c
        //内层元素
        System.out.println(arr1[1][2]);//false

        String[][] arr2 = new String[3][4];
        //外层元素
        System.out.println(arr2[1]);//[Ljava.lang.String;@41629346
        //内层元素
        System.out.println(arr2[1][2]);//null
        //6.数组的内存解析
    }
}
