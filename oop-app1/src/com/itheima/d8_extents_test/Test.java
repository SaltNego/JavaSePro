package com.itheima.d8_extents_test;

/**
 * @author： Negoowen
 * @date： 2022-02-23
 * @project_name: javase_pro
 */
public class Test {
    public static void main(String[] args) {

        //创建学生对象
        Student s = new Student();
        s.setName("张松松");//父类的
        s.setAge(25);//父类的
        s.setClassName("Java999期");//子类的
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getClassName());
        s.queryCourse(); //父类的
        s.writeInfo(); //子类的

        System.out.println("===================");

        Teacher t = new Teacher();
        t.setName("李明");
        t.setAge(34);
        t.setDepartmentName("java部门 ");
        System.out.println(t.getDepartmentName());
        System.out.println(t.getName());
        t.queryCourse();
        t.askQuestion();

    }
}
