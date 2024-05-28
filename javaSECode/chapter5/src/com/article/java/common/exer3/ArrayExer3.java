package com.article.java.common.exer3;

/**
 * @projectName: JavaProjectCode
 * @package: com.article.java.common.exer3
 * @className: ArrayExer3
 * @author: 拾叁拾玖
 * @description: TODO
 * @date: 2024/5/10 上午11:04
 * @version: 1.0
 */
public class ArrayExer3 {
    public static void main(String[] args) {
//        案例：使用二维数组打印一个 10 行杨辉三角。
//
//        提示：
//        1. 第一行有 1 个元素, 第 n 行有 n 个元素
//        2. 每一行的第一个元素和最后一个元素都是 1
//        3. 从第三行开始, 对于非第一个元素和最后一个元素的元素。即：
//        yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
        System.out.println("======================================================================================");
        int[][] yanghui = new int[10][];
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];
            yanghui[i][0] = 1;
            yanghui[i][i] = 1;
            for (int j = 1; j < i; j++) {
                yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j];
            }
        }
        for (int[] into : yanghui) {
            for (int anInt : into) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        System.out.println("======================================================================================");
    }
}
