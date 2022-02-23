package com.itheima.d8_extents_test;

/**
 * @author： Negoowen
 * @date： 2022-02-23
 * @project_name: javase_pro
 */
public class Teacher extends Role {

    private String departmentName;

    public void askQuestion() {
        System.out.println(getName()+"对于"+departmentName+" 有问题！！！");
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }


}
