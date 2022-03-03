package com.itheima.d14_this;

/**
 * @author： Negoowen
 * @date： 2022-03-02
 * @project_name: javase_pro
 */
public class Student {
    private String name;
    private String schoolName;

    public Student(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }
    public Student(String name) {
        this(name,"heima it zhongxin");
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
