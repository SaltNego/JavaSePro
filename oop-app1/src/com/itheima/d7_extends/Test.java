package com.itheima.d7_extends;

/**
 * @author： Negoowen
 * @date： 2022-02-23
 * @project_name: javase_pro
 */
public class Test {
    public static void main(String[] args) {
        //创建子类对象，看是否可以使用父类的属性和行为
        Student s = new Student();
        s.setName("西门");//父类的
        s.setAge(25);//父类的
        System.out.println(s.getName());//父类的
        System.out.println(s.getAge());//父类的
        s.Study();

        Teacher t = new Teacher();
        t.setName("代维");
        t.teach();
    }
}
