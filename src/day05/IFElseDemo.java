package day05;

public class IFElseDemo {
    public static void main(String[] args) {
/**
 * 双路分支语句结构
 * if（boolean）{
 *  成立执行的代码块
 *  }else{
 *      不成立执行的代码块
 *  }
 *
 *  执行过程：
 *  先判断if小括号中的条件 是否成立
 *  若成立 执行--成立执行的代码块
 *  若不成立 执行--不成立执行的代码块
 */

    double price = 900;

    if(price>=500){
        price*=0.8;
        System.out.println("打完8折应付："+price);
    }else {//否则
        price*=0.9;
        System.out.println("打完9折应付："+price);
    }
        System.out.println("已付款："+price);







    }
}
