package day06;

public class ForDemo {
    public static void main(String[] args) {
        /** 一直循环次数的场景使用for循环
         *  for 循环的语法结构
         *      循环的三要素：1、循环变量的初始化 2、基于循环变量的条件 3、循环变量的改变
         *
         *      for(int count=1;count<3;count++){//1、2、3
         *          循环的代码块//4
         *      }
         *
         *      执行过程：
         *      先去执行 1 2 4
         *      然后执行 3 2 4
         *      再后执行 3 2 4
         *      直到 2 不满足 循环结束
         *      代码继续往后执行
         */

//        //同学们加油！！  X3
//        for(int count =0;count<3;count++){
//            System.out.println("同学们加油！！！");
//        }


//        //continue 循环中可使用的关键字 作用：跳过当次循环 直接到达 第 3 步（直接进入下次的循环执行过程）
//        for (int i=1;i<=10;i++){
//            if (i%2==0){//如果成立则为偶数
//                System.out.println(i+"是偶数！");
//                continue;
//            }
//            System.out.println(i+"是奇数！");
//        }

//        //-----break 关键字 作用：在循环体中，代表退出当前循环（即使循环没做完也不做了）
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("张同学跑第" + i + "圈！");
//            if (i > 5) {
//                System.out.println("老师我肚子疼....");
//                break;
//            }
//        }
//        System.out.println("不跑了让孩子歇歇。");

        /**
         *  双层for循环 又叫循环嵌套
         *  99乘法表
         *  for(){
         *      for(){
         *          ;
         *      }
         *  }
         */
        //双重for循环 九九乘法表
        for(int number=1;number<=9;number++){
            for (int i=1;i<=number;i++){
                System.out.print(i+"*"+number+"="+number*i+"\t");
            }
            System.out.println();
        }



    }
}




