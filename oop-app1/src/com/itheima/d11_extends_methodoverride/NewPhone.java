package com.itheima.d11_extends_methodoverride;

/**
 * @author： Negoowen
 * @date： 2022-02-28
 * @project_name: javase_pro
 */
public class NewPhone extends Phone {

    @Override
    public void call() {
        super.call();
        System.out.println("支持视频通话");

    }

    @Override
    public void seedMessage() {
        super.seedMessage();
        System.out.println("支持发送图片~~~~");
    }
}
