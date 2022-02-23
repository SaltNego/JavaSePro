package com.itheima.d4_static_attention;

/**
 * @author： Negoowen
 * @date： 2022-02-17
 * @project_name: javase_pro
 */
public class Test {
    //静态成员变量
    public static int onLineNumber;
    //实例成员变量
    private String name;

    public static void getMax(){
        //1.静态方法可以直接访问静态成员。
        System.out.println(Test.onLineNumber);
        System.out.println(onLineNumber);
        inAddr();

        Test t = new Test();
        System.out.println(t.name);
        //以上允许，以下不允许，需要先创建对象。
        //System.out.println(name);

        //3.静态方法中不能出现this关键字
        //System.out.println(this);

    }

    public void run(){
        //2.实例方法可以直接访问静态成员,也可以访问实例成员
        System.out.println(Test.onLineNumber);
        System.out.println(onLineNumber);
        Test.getMax();
        getMax();

        System.out.println(name);
        sing();

        System.out.println(this);
    }

    public void sing(){
        System.out.println(this);
    }

    //静态成员方法
    public static void inAddr(){
        System.out.println("我们在黑马程序员~~~");
    }

    public static void main(String[] args) {
        //Test.getMax();
        Test t = new Test();
        t.run();
    }
}
