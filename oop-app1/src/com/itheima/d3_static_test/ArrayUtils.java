package com.itheima.d3_static_test;

/**100
 * @author： Negoowen
 * @date： 2022-02-17
 * @project_name: javase_pro
 */
public class ArrayUtils {
    /**
     * 把它的构造器私有化
     */
    private ArrayUtils(){
    }

    /**
     * 静态方法：工具方法
     */
    public static String toString(int[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += (i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        result += "]";
        return result;
    }

    /**
     * 静态方法:工具方法
     */

    public static double getAverage(int [] arr){
        //总和  最大值 最小值
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] >max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
            sum += arr[i];
        }
        return (sum - max - min) * 1.0 / (arr.length -2);
    }

}
