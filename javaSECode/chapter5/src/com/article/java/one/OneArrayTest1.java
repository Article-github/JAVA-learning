package com.article.java.one;

public class OneArrayTest1 {
    public static void main(String[] args) {
        // 整形数组元素的魔人初始化值
        int[] arr1 = new int[5];
        System.out.println(arr1[0]);
        // 浮点型数组的默认初始化值
        double[] arr2 = new double[5];
        System.out.println(arr2[0]);
        // 字符型数组的默认初始化值
        char[] arr3 = new char[5];
        System.out.println(arr3[0]);
        if(arr3[0] == '0'){
            System.out.println("小美");

        }else{
            System.out.println("小兰");
        }
        //boolean型数组的默认初始化值
        boolean[] arr4 = new boolean[5];
        System.out.println(arr4[0]);
        // 引用型数组的默认初始化值
        String[] arr5 = new String[5];
        System.out.println(arr5[0]);

        if(arr5[0]==null){
            System.out.println("小美");
        }
//        Java中的内存结构的划分
//        一维数组的内存解析
        int[] arr6 = new int[5];
        arr6[0] = 10;
        arr6[1] = 20;
        arr6[2] = 30;
        System.out.println(arr6[0]);
        System.out.println(arr6[1]);
        System.out.println(arr6[2]);

//        定义数组变量arr1，将arr的地址解析赋值给arr1
        int[] arr7 = arr6;
        arr7[1]=9;

        System.out.println(arr6[1]);


    }
}
