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
public class BinarYsearchTest {
    public static void main(String[] args) {
//        案例2：二分法查找
//
//        定义数组：int[] arr2 = new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};
//        查找元素5是否在上述数组中出现过？如果出现，输出对应的索引值。
        int[] arr2 = new int[]{2,4,5,8,12,15,19,26,37,49};
        int target = 5;
        int head = 0;
        int tail = arr2.length - 1;
        while (head <= tail) {
            int mid = (head + tail) / 2;
            if (arr2[mid] == target) {
                System.out.println("找到了，索引为：" + mid);
                break;
            } else if (arr2[mid] > target) {
                tail = mid - 1;
            } else {
                head = mid + 1;
            }
        }
        if (head > tail) {
            System.out.println("没找到");
        }
    }
}
