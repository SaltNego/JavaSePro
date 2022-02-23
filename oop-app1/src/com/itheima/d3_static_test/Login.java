package com.itheima.d3_static_test;

/**
 * @author： Negoowen
 * @date： 2022-02-17
 * @project_name: javase_pro
 */
public class Login {

    public static void main(String[] args) {
        //验证码
        System.out.println("验证码" + VerifyTool.createCode(5));
    }
}
