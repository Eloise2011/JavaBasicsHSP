package chapter07_OOP;

/**
 * @author Joshua.H.Brooks
 * @description 由一个问题引入面向对象的概念
 * @date 2025-12-09 12:38
 */

import java.util.Scanner;

/**
 * 类与对象
 * 看一个养猫猫问题
 * 张老太养了两只猫猫：一只名字叫小白，今年3岁，白色。
 * 还有一只叫小花。今年100岁，花色。
 * 请编写一个程序，当用户输入小猫的名字时，就显示该猫的名字，年龄，颜色。
 * 如果用户输入的小猫名错误，则显示张老太没有这只猫猫。
 */
public class _01ProblemIntro {
    public static void main(String[] args) {
        String catName_1="Little white";
        int catAge_1 = 3;
        String catColor_1 = "white";
        String catName_2="Little flower";
        int catAge_2 = 100;
        String catColor_2 = "colorful";

        // ？？？？ 如果有很多猫？ 如果猫的属性有增加/减少， 比如花色变为毛发，添加重量，食物等 ？ 那么所有猫都需要做相应的改变，很难维护。

    }
}
