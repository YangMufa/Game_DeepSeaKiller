package day06;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        /**
         * do..while 循环结构
         * 1.循环初始化
         * do{
         *     循环代码块
         *     3.
         * }while(2.条件);
         *
         * 执行过程：
         * 先去做do 的循环代码块 然后再去判断while小括号中的条件
         * 若条件成立 再次执行 do的循环代码块 再判断while小括号中的条件
         * 若若条件成立 再次再次 do的循环代码块 再次判断while小括号中的条件
         * ....
         * 若条件不成立 则代码块继续往后执行....
         */
//
//        int count = 0;//1
//        do {
//            System.out.println("今天大家非常棒！我们继续保持 ！奥里给！");
//            count++; //3.
//        }while (count < 3); //2.

        /**
         * -------随机数
         */
        Math.random();//返回给一个double类型 从0~1区间的小数，取不到1
//        double r = Math.random();//0~1区间的小数
//        double r=Math.random()*100;//0~100区间的小数
//        int r=(int)(Math.random()*100);//0~100区间的整数

        //得到某个区间的随机数公式：(int)(随机数函数*(最大值+1-最小值)+最小值)
//        int r=(int)(Math.random()*(1500-500)+500);//返回500~1500的随机整数
//        System.out.println(r);

        /**
         *  运行产生一个随机数，提示用户在控制台输入数据 来进行猜大小
         */
//        int random =(int)(Math.random()*100);
//        System.out.print("开始猜大小 请输入区间0~99的数：");
//        Scanner in = new Scanner(System.in);
//        int user = in.nextInt();
//        if (user == random){
//            System.out.println("\n猜对了！");
//        }else if (user>random){
//            System.out.println("\n猜大了！");
//        }else{
//            System.out.println("\n猜小了！");
//        }

        //循环条件：用户输入的数据不等于系统产生的数据
        int random =(int)(Math.random()*100);
        Scanner in = new Scanner(System.in);
        System.out.println("开始猜大小 请输入区间0~99的数：");
        int user = 0;

        do {

            user=in.nextInt();
            System.out.print("请从新输入区间0~99的数：");
            if (user == random){
                System.out.println("\n猜对了！");
            }else if (user>random){
                System.out.println("\n猜大了！");
            }else{
                System.out.println("\n猜小了！");
            }

        }while(user!=random);








    }
}
