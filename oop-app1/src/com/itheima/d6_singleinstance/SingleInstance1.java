package com.itheima.d6_singleinstance;

/**
 * @author： Negoowen
 * @date： 2022-02-23
 * @project_name: javase_pro
 */

/**
 * 目标：学会使用饿汉单例方式定义单例类
 */
public class SingleInstance1 {
    /**
     * 2.定义一个公开的静态的成员变量存储一个类的对象。
     * 饿汉：在这里加载静态变量的时候就会创建对象了。
     * public static int onLineNumber = 161;
     */
    public static SingleInstance1 instance1 = new SingleInstance1();
    /**
     * 1.把构造器私有起来
     */
    private SingleInstance1() {

    }




}
