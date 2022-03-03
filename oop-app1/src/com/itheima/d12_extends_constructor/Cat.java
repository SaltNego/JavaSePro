package com.itheima.d12_extends_constructor;

/**
 * @author： Negoowen
 * @date： 2022-03-02
 * @project_name: javase_pro
 */
public class Cat extends Animal {

    public Cat() {
        System.out.println("子类cat无参构造器被执行~");
    }

    public Cat(String s) {
        System.out.println("有参数的构造器被执行~");

    }
}
