package com.article.java.one;

public class OneArrayTest {
    public static void main(String[] args) {
        //1,数组的命名与初始化
        int num1 = 10;
        int num2 = 20;

        //声明数组
        double[] prices= new double[]{20.32,43.21,43.22};

        //数组的初始化、静态初始化{数组元素的赋值与初始化操作同时进行}
        //数组初始化完成后其长度不可更改。
        //数组元素类型与数组元素个数确定后不可更改。
        String[] foods1 = new String[]{"锅包肉","溜肉段","肉夹馍"};
        //定义数组容量、动态初始化
        String[] foods2 = new String[4];
        //其他数组定义方式
        int[] nums1 = {1,2,3,4,5};
        int arr[] = new int[5];
        //数组元素的调用
        //通过角标的方式获取数组元素
        System.out.println(foods1[0]);
        foods2[0] = "宫保鸡丁";
        foods2[1] = "红烧肉";
//      foods2[4] = "鱼香肉丝"; //报错显示：超出数组索引范围
        //数组长度为0~长度-1；
        //数组的长度:用来描述数组容器中容量大小
        //使用Length属性获取数组的长度
        System.out.println("数组的长度为："+foods2.length);
        System.out.println("数组的容量为："+nums1.length);
        //如何遍历数组
        for (int i = 0; i < foods2.length; i++){

            System.out.println(foods2[i]);

        }
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }
        //


    }
}
