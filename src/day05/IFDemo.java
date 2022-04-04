package day05;

public class IFDemo {
    public static void main(String[] args) {
        /**
         * if(boolean){
         *     //条件成立执行的代码块
         * }
         *  判断if小括号中的boolean值
         *  若为true 则执行条件成立的代码块
         *  若为false 代码跳过if的代码块。。。继续往后执行
         */
        double price = 500;//金额500
        if (price>=500){//如果金额大于等于500
            price*=0.8;//price=price*0.8
            System.out.println("打完八折后应付款："+price);
        }
        System.out.println("已付款："+price);




    }
}
