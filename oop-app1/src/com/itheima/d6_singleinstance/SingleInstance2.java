package com.itheima.d6_singleinstance;

/**
 * @author： Negoowen
 * @date： 2022-02-23
 * @project_name: javase_pro
 */
/**
 * 学会使用懒汉单例模式设计单例类
*/
public class SingleInstance2 {
    /**
     * 2.创建一个静态的成员变量存储本类的对象，注意：此时不能初始化对象
     */
    private static SingleInstance2 instance;
    /**
     * 1.私有构造器
     */
    private SingleInstance2(){

    }
    /**
     * 定义一个方法，让其他方法可以来调取一个对象
     */
    public static SingleInstance2 getInstance() {
        if (instance == null) {
            instance = new SingleInstance2();
        }
        return instance;
    }
}
