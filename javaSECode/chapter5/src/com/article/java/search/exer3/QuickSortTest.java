package com.article.java.search.exer3;

/**
 * @projectName: JavaProjectCode
 * @package: com.article.java.search.exer3
 * @className: QuickSortTest
 * @author: 拾叁拾玖
 * @description: TODO
 * @date: 2024/5/11 上午11:15
 * @version: 1.0
 */
public class QuickSortTest {
//    案例：使用快速排序，实现整型数组元素的排序操作
//
//    比如：int[] data = { 9, -16, 30, 23, -30, -49, 25, 21, 30 };
    public static class QuickSortExample {

    // 快速排序方法
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // 找到分区的索引
            int pivotIndex = partition(arr, low, high);

            // 递归地对左右子数组进行快速排序
            quickSort(arr, low, pivotIndex - 1); // 排序左半部分
            quickSort(arr, pivotIndex + 1, high); // 排序右半部分
        }
    }

    // 分区操作
    private static int partition(int[] arr, int low, int high) {
        // 选择最后一个元素作为基准值
        int pivot = arr[high];
        int i = (low - 1); // i是小于pivot的元素的索引

        for (int j = low; j < high; j++) {
            // 如果当前元素小于或等于pivot
            if (arr[j] <= pivot) {
                i++;

                // 交换arr[i]和arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // 把基准值放到正确的位置
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // 返回pivot的正确位置
        return i + 1;
    }

    // 主方法，用于测试快速排序
    public static void main(String[] args) {
        int[] data = { 9, -16, 30, 23, -30, -49, 25, 21, 30 };
        System.out.println("原始数组:");
        printArray(data);

        quickSort(data, 0, data.length - 1);

        System.out.println("排序后的数组:");
        printArray(data);
    }

    // 打印数组的方法
    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

}