package com.itheima.d3_static_test;

import java.util.Random;

/**
 * @author： Negoowen
 * @date： 2022-02-17
 * @project_name: javase_pro
 */
public class VerifyTool {
    /**
     * 私有构造器
     * 建议将工具类的构造器进行私有，工具类无需创建对象,避免浪费内存资源。
     */
    private VerifyTool() {
    }

    /**
     * 静态方法
     */
    public static String createCode(int n) {
        //1、使用String开发一个验证码
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFG";
        //2.定义一个变量用于存储5位随机的字符作为字符串
        String code = "";
        //3.循环
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(chars.length());
            //4.对应索引提取字符
            code += chars.charAt(index);
        }
        return code;
    }


}
