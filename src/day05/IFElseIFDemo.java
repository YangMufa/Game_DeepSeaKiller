package day05;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLPortType;

import java.util.Scanner;

public class IFElseIFDemo {
    public static void main(String[] args) {

        IFElseIFDemo IED = new IFElseIFDemo();
//        IED.branching();
//        IED.ageJudgment();
//        IED.switchBranching();


    }


    public static void branching() {//多路分支

        /**
         *多路分支
         * 从上往下有上面有一个条件成立则后面的不再判断执行
         *  if(boolean1){
         *      若条件1成立则执行代码块
         *  }else if(boolean2){
         *      若条件2成立执行的代码块
         *  }else if(boolean2){
         *      若条件2成立执行的代码块
         *   }else if(){}.......
         *
         *   执行过程：
         *   先判断 条件1 若条件1满足 则执行条件1代码块 否则
         *   再判断 条件2 若条件2满足 则执行条件2代码块 否则
         *   再判断 条件3 若条件3满足 则执行条件3代码块 否则
         *   ......
         */

        /**
         *  需求：根据用户输入的分数 来判断分数等级。
         *  A.分数 大于等于 90 数据优秀！
         *  B.分数 小于90 并且分数大于80 输出良好
         *  C.分数 小于80 并且分数大于等于70 数输出一般
         *  D.分数 小于70 并且分数大于等于60 输出及格
         *  E.分数 小于60 输出 不及格
         */

        int score = 40;
        if (score >= 90) {
            System.out.println("优秀！");
        } else if (score < 90 && score >= 80) {
            System.out.println("良好");
        } else if (score < 80 && score >= 70) {
            System.out.println("一般");
        } else if (score < 70 && score >= 60) {
            System.out.println("及格");
        } else if (score < 60) {
            System.out.println("不合格");
        }
        System.out.println("\n程序继续往后执行......");

    }


    public static void ageJudgment() {//年龄判断

        /**  通过控制台的方式 获取用户输入的年龄 根据年龄判断人生阶段
         *      int age = ?;
         *      A. 如果 age 大于等于 0 并且小于 5   输出幼年！
         *      B. 如果 age 大于等于 5 并且小于18   输出青年！
         *      C. 如果 age 大于等于 18 并且小于 35 输出成年！
         *      D. 如果 age 大于等于 35 并且小于 50 输出中年！
         *      E. 如果 age 大于等于 50 并且小于 65 输出中老年！
         *      F. 如果 age 大于等于 65 并且小于 150 输出老年！
         *      否则 年龄不合法！
         * */

        int age = 40;
        Scanner in = new Scanner(System.in);
        System.out.print("请输入年龄：");
        age = in.nextInt();
        if (age >= 0 && age < 5) {
            System.out.println("幼年！");
        } else if (age >= 5 && age < 18) {
            System.out.println("青年");
        } else if (age >= 18 && age < 35) {
            System.out.println("成年");
        } else if (age >= 35 && age < 50) {
            System.out.println("中年");
        } else if (age >= 50 && age < 65) {
            System.out.println("中老年");
        } else {
            System.out.println("老年");
        }
        System.out.println("\n时光荏苒，继续奔跑......");
    }

    public static void switchBranching() {
        /**
         * switch ...case 多路分支的使用方式
         * switch(){
         *     case 1：
         *              代码块
         *              break;跳出代码块
         *     case 2：
         *              码块
         *              break;跳出代码块
         *     case ......
         * }
         *
         * 优点：如果只对单个整数数据判断是否匹配某个数组时，用switch case 结构分支效率更高
         * break 退出switch 结构的代码块
         * default 未匹配上执行
         */

        int userIinput = 3;
        Scanner in = new Scanner(System.in);
        System.out.println("1 取款，2 存款，3 转账\n");
        userIinput = in.nextInt();
        switch (userIinput) {//判断变量的类型 需要是整数类型（不支持long）或String
            case 1:
                System.out.println("取款业务开始办理中...");
                break;//跳出switch，如果没有break则继续执行下面代码且不再进行判断
            case 2:
                System.out.println("存款业务开始办理中...");
                break;
            case 3:
                System.out.println("转账业务开始办理中...");
            default://case都没匹配上执行如下语句
                System.out.println("输入有误！");
        }
        System.out.println("\n代码继续往后执行...");
    }
}




