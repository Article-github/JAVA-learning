/*
 * Copyright (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.article.java.one.exer1;

/**
 * 案例："破解"房东电话
 *
 * 升景坊单间短期出租4个月，550元/月（水电煤公摊，网费35元/月），空调、卫生间、厨房齐全。屋内均是IT行业人士，喜欢安静。
 * 所以要求来租者最好是同行或者刚毕业的年轻人，爱干净、安静。
 *
 */

public class ArrayExer {
    public static void main(String[] args) {
        int[] arr = new int[] {5,1,2,4,3,9};
        int[] index = new int[] {1,0,1,2,3,3,2,3,4,3,5};

        StringBuilder tel = new StringBuilder();

        for (int value : index) {
            tel.append(arr[value]);
        }
        System.out.println("电话号为：" + tel);
        //15124424349
    }

}
