package com.itheima.d6_singleinstance;

/**
 * @author： Negoowen
 * @date： 2022-02-23
 * @project_name: javase_pro
 */
public class Test2 {
    public static void main(String[] args) {
        SingleInstance2 s1 = SingleInstance2.getInstance();
        SingleInstance2 s2 = SingleInstance2.getInstance();
        SingleInstance2 s3 = SingleInstance2.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
