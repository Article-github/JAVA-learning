package com.article.java.common.exer4;

import java.util.Arrays;

/**
 * @projectName: JavaProjectCode
 * @package: com.article.java.common.exer4
 * @className: ArrayExer4
 * @author: 拾叁拾玖
 * @description: TODO
 * @date: 2024/5/10 下午2:50
 * @version: 1.0
 */
public class ArrayExer4 {
    public static void main(String[] args) {
//        案例：
//
//        使用简单数组
//        (1)创建一个名为ArrayTest的类，在main()方法中声明array1和array2两个变量，他们是int[]类型的数组。
//        (2)使用大括号{}，把array1初始化为8个素数：2,3,5,7,11,13,17,19。
//        (3)显示array1的内容。
//        (4)赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值(如array[0]=0,array[2]=2)。
//        (5)打印出array1。
//
//        思考：array1和array2是什么关系？
//        【answer】array1和array2是两个变量，共同指向了堆空间中的同一个数组结构。即二者的地址值相同。
//
//        拓展：修改题目，实现array2对array1数组的复制
        int[] array1,array2;
        array1 = new int[]{2,3,5,7,11,13,17,19};
        array2 = array1;
        int [] array3 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }//复制数组
        System.out.println(array1);
        System.out.println(array3);
        System.out.println("array1:"+ Arrays.toString(array1));
        for (int i = 0; i < array2.length; i++) {//修改array2中的偶索引元素，使其等于索引值
            if (i%2==0){
                array2[i]=i;
            }
        }
        System.out.println("array1:"+ Arrays.toString(array1));
    }
}
