package com.article.java.search.exer2;

/**
 * @projectName: JavaProjectCode
 * @package: com.article.java.search.exer2
 * @className: Arrayexer2
 * @author: 拾叁拾玖
 * @description: TODO
 * @date: 2024/5/11 上午9:12
 * @version: 1.0
 */
public class LinearSearchTest {
//    案例1：线性查找
//
//    定义数组：int[] arr1 = new int[]{34,54,3,2,65,7,34,5,76,34,67};
//    查找元素5是否在上述数组中出现过？如果出现，输出对应的索引值。
    public static void main(String[] args) {
        int[] arr1 = new int[]{34,54,3,2,65,7,345,5,76,34,67};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 5){
                System.out.print("找到元素" + arr1[i] + "的索引值：" + i);
            }
            if (i == arr1.length - 1){
                System.out.print("没有找到元素5");
            }
        }
    }
}
