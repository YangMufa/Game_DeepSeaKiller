package day04;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Scanner;

//运算符
public class Operation01 {
    public static void main(String[] args) {
//        1、数学运算符 + - * %（取余）
//        2、自增自减运算符 += -=
//        3、关系运算符  > <  >= <= == != 运算结果为boolean类型的true、false
//        4、逻辑运算符 && || ！(取反) 运算结果为boolean类型的true、false
//        5、值运算符
//        6、三元运算符
//        7、字符运算符

        //数学运算符
//        int a=10;
//        int b=5;
//        System.out.println("a+b："+a+b);
//        System.out.println("a-b："+(a-b));
//        System.out.println("a*b："+a*b);
//        System.out.println("a/b："+a/b);
//        System.out.println("a%b："+a%b);
//        //取余操作时，若左边的数据小于右边的数据时运算结果为左边原数
//        System.out.println("b%a(左边小于右边)："+b%a);
//        System.out.println("a%b(左边大于右边)："+a%b);
//        //取余操作时，若左边的数据等于右边的数据时运算结果为0
//        System.out.println("b%b(左边等于右边)："+b%b);

//        //自增自减运算符
//        int a=10;
//        int b=5;
//        //参与运算是（赋值运算也算）符号在前在后不一样
//        a++;
//        ++a;//单独运算时运算符在变量前还是变量后都一样
//        System.out.println(a);
//        //符号如果在前就执行符号自增或自减，然后再参与其他运算
//        //符号如果在后，就会先参与其他运算，然后再进行自增或自减
//        int c =5;
//        int d =5;
//        int e =c++;
//        int f =++d;
//        int g=d++ - --c;
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);
//        System.out.println(g);
//        //面试题
//        int a1=1;
//        a1=a1++;
//        System.out.println(a1);//等于1而不是2

//        //关系运算符
//        int a=50;
//        int b=40;
//        int c=50;
//        int d=50;
//        boolean e=a>=d;
//        boolean f=a==c;
//        boolean g=d<b;
//        System.out.println(e);
//        System.out.println(f);
//        System.out.println(g);

        //逻辑运算符
        // && 与 ，在逻辑与的运算中，两个或多个条件有一个不成立，其结果一定不成立
        // || 或 ，在逻辑或的运算中，两个或多个条件有一个成立，其结果一定成立
        // ！ 非(取反) ，非真即假，非价即真
//        int a=5;
//        int b=10;
//        int c=5;
//        boolean result=a>b&&b>c;//flase && true  并且关系中见false
//        System.out.println(result); //false   及是false
//        System.out.println(a>b||b>c);//true || true 见true即true
//        System.out.println(a==++c&&c>5);//fasle
//        System.out.println(c);//6
//        System.out.println(!true);//false
//        System.out.println(!false);//true

//        /** 输入一个年份判断是否为润年
//         * 润年条件一：年份能被4整除并且不能被100整除
//         * 润年条件二：年份能被400整除
//         * 满足其一条件即可
//         */
//        Scanner in =new Scanner(System.in);//创建一个扫描器对象
//        int year= in.nextInt();//使用扫描器读取int类型的数据，赋值给year
//        System.out.println( (year%4==0&&year%100!=0) || (year%400==0) );//判断

        //短路逻辑


















    }
}
