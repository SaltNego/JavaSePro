package com.itheima.d3_static_test;

/**
 * @author： Negoowen
 * @date： 2022-02-17
 * @project_name: javase_pro
 */
public class TestDemo {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4,6, 4, 4, 4,8};
        String result = ArrayUtils.toString(arr1);
        System.out.println(result);

        double aver = ArrayUtils.getAverage(arr1);
        System.out.println(aver);
    }

    public TestDemo() {
    }
}
