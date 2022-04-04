package day06;

public class WhileDemo {
    public static void main(String[] args) {
        //循环结构:重复执行某个事情（代码），反反复复的过程，称之为循环
        //Java中循环分为3种：1.while 2.do..while 3.for（常用)
        //循环三要素：1.循环变量的初始化 2.基于循环变量的条件 3.循环变量的改变

        /**
         * 循环结构
         */

        int count =1 ;
        while(count <= 10){//循环条件
            System.out.println("业涛同学跑完 "+count+ " 圈");
            count++;
        }
        System.out.println("写一个很重要的程序.....");

    }
}
