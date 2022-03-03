package com.itheima.d13_extends_constructor2;

/**
 * @author： Negoowen
 * @date： 2022-03-02
 * @project_name: javase_pro
 */
public class Test {
    public static void main(String[] args) {

        Student s = new Student();
        Student s1 = new Student("zhangsan",21,"99");
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
        System.out.println(s1.getClassName());
    }
}
