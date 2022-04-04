package OO.day03;

/**
 * 常量演示类
 */
public class StaticFinalDemo {
    public static void main(String[] args) {

        //编译期间自动将常量中的内容 转换为具体是的值 打印Eoo.c 相当于打印 900
        System.out.println(Eoo.C);//通类名点的形式访问常量

        //1、假设第一次用Eoo，先将Eoo加载到方法区
        //2、获取方法区中 a 这个静态的数据
        System.out.println(Eoo.a);//通类名点的形式访问静态变量
    }
}

class Eoo{
    static int a;//静态变量 通过类名访问
    final int b=100;//final修饰的变量 不能二次修改 且需要声明是初始化
    //常量
    static final int C=900;//需要声明是初始化
}