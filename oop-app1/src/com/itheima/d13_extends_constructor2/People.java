package com.itheima.d13_extends_constructor2;

/**
 * @author： Negoowen
 * @date： 2022-03-02
 * @project_name: javase_pro
 */
public class People {
    private String name;
    private int age;

    public People() {

    }
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
