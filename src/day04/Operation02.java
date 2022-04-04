package day04;

/**
 *拓展赋值号的使用
 * 三元(三目)表达式
 * 字符串拼接
 */
public class Operation02 {
    public static void main(String[] args) {
//        //拓展赋值号的使用
//        int a =10;
//        a+=10;//等价于a=a+10;
//        System.out.println(a);
//
//        a-=10;//等价于a=a-10
//        System.out.println(a);
//
//        a*=2;//等价于a=a*2
//        System.out.println(a);
//
//        a/=5;//等价于a=a/5
//        System.out.println(a);
//
//        a%=2;//等价于a=a%2
//        System.out.println(a);
//
//        //Boolean ? 值1 : 值2 ，若为true返回值1，若为false返回值2
//        int number1=10;
//        int number2=20;
//        //变量max的类型取决于值1和值2的类型，且值1和只2的类型需要一致
//        int max = number1>number1?number1:number2;
//        System.out.println("max=："+max);
//
//        int num=10;
//        boolean result =num%2==0 ? true:false;
//        System.out.println(result);//true 是偶数

        //字符串拼接符
        //字符是 char类型 用单引号 存储一个字符
        //字符串是String 用双引号 存储一串字符
        //使用 + 时，若两边都是数值类型 则会进行运算操作
        //使用 + 时，如果有一方 为字符串类型，则会进行拼接操作
        int num=10;
        boolean result =num%2==0 ? true:false;
        System.out.println("num是否为偶数: "+result);//true 是偶数
        int age =30;
        String nmme ="张三";
        System.out.println("我叫："+""+30);
        System.out.println(""+10+20);//1020
        System.out.println(10+50+"");//60

//        byte b=5;
//        b=()b+5;//报错 b+5结果是大类型转小类型需要强用转语法























    }
}
