package Operation;

/**
 * 2022年3月13日
 * 杨木发
 * 第一次作业
 */

import java.util.Scanner;

public class OD22031 {
    public static void main(String[] args) {
        OD22031 OD23 = new OD22031();

        OD23.reverseOrder();// 1.输入的一个整数，按相反顺序输出该数

        OD23.summation();// 2.用 while 循环，计算 1~200 之间所有 3 的倍数之和

        OD23.averageAge();// 3.循环录入5个人的年龄，并计算平均年龄，当录入负数或大于130时，立即停止输出报错

        OD23.randomNumber();// 4.让计算机随机产生10个0到2之间的数,输出白猪黑猪

        OD23.sumDay();// 5.计算2000年1月1日到2008年1月1日相距多少天。

        OD23.printPyramid();// 6.打印n行的金字塔

        OD23.taximeter();//7.出租车计价器


    }

    /**
     * 1.编写程序，对输入的一个整数，按相反顺序输出该数。例如，输入为 3578
     */
    public static void reverseOrder () {
        Scanner in = new Scanner(System.in);
        System.out.print("\n输入一个整数 让我来把它的顺序调反:");
        int num = in.nextInt();//用户输入一串数字
        String temp=num+"";//把用户输入的数字转换成字符串赋值给temp变量
        char number[] = temp.toCharArray();//把temp字符串变为数组赋值给number数组
        temp="";//此时number已得到temp的值，可以把temp置空了
        for (int i=number.length-1;i>=0;i--){//由于是从0开始的所以循环的次数等于数组的长度减一，由于需要反向调换位置所以为 i--
            temp+=number[i];//字符串拼接
        }
        System.out.println("输入整数 "+num+" 相反顺序后为："+temp);
    }

    /**
     * 2.用 while 循环，计算 1~200 之间所有 3 的倍数之和。
     */
    public static void summation() {
        int sum=0;
        for (int i = 1; i <=200 ; i++) {
            if (i % 3==0) {
                sum+=i;
//                System.out.println("3的倍数："+i+"; 是3的 "+i/3+" 倍");
            }
        }
        System.out.println("\n1~200 之间所有 3 的倍数之和是："+sum);
    }

    /**
     * 3.循环录入5个人的年龄，并计算平均年龄，如果录入的数据出现负数或者大于130的数，立即停止输出报错
     */
    public static void averageAge () {
        int sum=0,temp=1,i=1;
        Scanner in = new Scanner(System.in);
        System.out.println("输入五个不能小于0大于130的年龄\n");
        for (; i <=5 ; i++) {
            System.out.print("输入第"+i+"个人的年龄：");
            temp=in.nextInt();
            if (temp<0||temp>130){
                System.out.println("\n错误！\n输入第"+i+"个人的年龄不符合常理,程序结束！！");
                break;
            }else if (temp>=0&&temp<=130){
                sum+=temp;
//                System.out.print("输入"+temp+"岁 ");
                temp=0;
            }
        }
        if (i==6) {//第五次循环后还有执行一次++，此时i变量为6
            System.out.println("平均年龄为："+(double)sum/i+"岁");
        }
    }

    /**
     * 4.让计算机随机产生10个0到2之间的数，
     * 如果产生的是0就输出“生成了一只白猪，我好怕怕”，
     * 如果产生的是1就输出“生成了一只黑猪，我喜欢”
     * 如果产生的是2就输出“生成了一只红猪，有下酒菜了”。
     */
    //得到某个区间的随机数公式：(int)(随机数函数*(最大值+1-最小值)+最小值)
    //int r=(int)(Math.random()*(1500-500)+500);//返回500~1500的随机整数
    public static void randomNumber () {
        int random=-1;
        for (int i = 0; i < 9; i++) {
            random=(int)(Math.random()*(3-0)+0);//由于取值规则是只能小于一次写3
            System.out.print(random);
            if (random == 0) {
                System.out.println("生成了一只白猪，我好怕怕");
            }else if (random == 1) {
                System.out.println("生成了一只黑猪，我喜欢");
            }else {
                System.out.println("生成了一只红猪，有下酒菜了");
            }
        }
    }

    /**
     * 5.计算2000年1月1日到2008年1月1日相距多少天。（注意闰年）
     */
    public static void sumDay() {
        int year=2000;
        int day=0;
        for (; year < 2008; year++) {
            if(year %4 == 0) {
                day+=366;
            }else{
                day+=365;
            }
        }
        System.out.println("2000年1月1日到2008年1月1日相距"+(day+1)+"天。");
    }

    /**
     * 6.打印n行的金字塔，如n=5时：
     *            *
     *           * *
     *          * * *
     *         * * * *
     *        * * * * *
     */
    public static void printPyramid() {
        for (int i = 1; i <= 5; i++) {//控制行数
            for (int j = i; j < 5; j++) {
                System.out.print(" ");//每行打印 5-i 个空格
            }
            for (int k = 1; k <= i; k++) {//控制列数
                System.out.print(" *");
            }
            System.out.println();//换行
        }
    }

    /**
     *出租车计费器:
     * 根据输入的路程(公里数)和等候时间（秒数），计算出车费，并将结果输出打印到控制台中显示。
     * 已知：
     * 1、出租车计费方式：里程钱数+等候时间钱数
     * 2、里程数3公里内（含3公里）计费10元；3公里至20公里部分（含20公里），3元/公里；20公里以上部分，4元/公里。
     * 3、等候时间（2分钟/元）,满2分钟收取1元钱，不足2分钟不要钱。按2分钟的整倍数收取费用。
     *   例如：等候时间2或3分钟收取1元钱；等候时间4或5分钟收取2元钱；...2n分钟收取n元钱。
     *
     * 提示：
     * 1、使用Scanner对象接收控制台输入的数据。
     * 2、里程数为浮点型数据，精确到小数点后1位。
     * 3、考虑使用分支语句完成。
     */
    public static void taximeter() {
        double mileage =0.0;//里程数
        double wait =0.0;//等候时间
        double cost=0.0;//费用
        Scanner in = new Scanner(System.in);
        System.out.print("请输入里程数：");
        mileage=in.nextDouble();
        System.out.print("请输入等候时间：");
        wait=in.nextDouble();

        if (mileage <=3.0) {
            cost+=10.0;//3公里内（含3公里）计费10元
        }else if (mileage >3.0&mileage<=20.0) {
            cost+=mileage*3;//3公里至20公里部分（含20公里），3元/公里；
        }else if (mileage >20.0) {
            cost+=mileage*4;//20公里以上部分，4元/公里
        }

//     候时间2或3分钟收取1元钱,等候时间4或5分钟收取2元钱...2n分钟收取n元钱。
        if (wait <2.0) {
            cost+=0.0;//不足2分钟不要钱
        }else if (wait >=2.0) {
            cost+=((double)((int)wait/2));//满2分钟收取1元钱，按2分钟的整倍数收取费用
        }
        System.out.println("共需支付："+cost+"元");
    }


}