package com.itheima.d5_static_codeblock;

/**
 * @author： Negoowen
 * @date： 2022-02-23
 * @project_name: javase_pro
 */
public class TestDemo1 {
    private static String schoolName ;

    static{
        System.out.println("start~~~~静态I代码被触发执行");
        schoolName = "哈哈哈哈哈哈哈哈";

    }
//作用：在程序加载时进行静态数据的初始化操作（准备内容）
    public static void main(String[] args) {
        System.out.println("静态代码块与类一起加载，并只执行一次");
        System.out.println(schoolName);
    }
}
