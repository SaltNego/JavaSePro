package com.itheima.d6_singleinstance;

/**
 * @author： Negoowen
 * @date： 2022-02-23
 * @project_name: javase_pro
 */
public class Test1 {
    public static void main(String[] args) {
        SingleInstance1 s1 = SingleInstance1.instance1;
        SingleInstance1 s2 = SingleInstance1.instance1;
        SingleInstance1 s3 = SingleInstance1.instance1;

        System.out.println(s1);
        System.out.println(s2);
    }
}
