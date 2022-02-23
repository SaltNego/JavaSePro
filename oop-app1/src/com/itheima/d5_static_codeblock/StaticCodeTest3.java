package com.itheima.d5_static_codeblock;

import java.util.ArrayList;

/**
 * @author： Negoowen
 * @date： 2022-02-23
 * @project_name: javase_pro
 */
public class StaticCodeTest3 {
    /**
     * 模拟初始化牌操作
     * 点数："3","4","5","6","7","8","9","10","J","Q","K","A","2"
     * 花色："♠"，"♥"，"♣"，"♦"
     * 准备一个容器，存储54张牌对象，这个容器建议使用静态的集合。静态的集合只加载一次。
     */
    //int age = 12;
    static ArrayList<String> cards = new ArrayList<>();

    /**
     * 2.在启动游戏之前需要准备54张牌放进去，使用静态代码块进行初始化
     */
    static {
        //3.加载54张牌进去。
        //4.准备4种花色：类型确定，个数确定了
        String [] colors = {"♠","♥","♣","♦"};
        //5.定义点数
        String[] sizes = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //6.先遍历点数，再组合花色
        for (int i = 0; i < sizes.length; i++) {
            for (int i1 = 0; i1 < colors.length; i1++) {
                cards.add(sizes[i] + colors[i1]);
            }
        }

        //7.添加大小王
        cards.add("小王");
        cards.add("大王");
    }

    public static void main(String[] args) {
        System.out.println("新牌：" + cards);
    }

}
