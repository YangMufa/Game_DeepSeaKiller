package OO.day03;

/**
 * 静态代码块的使用演示
 */
public class StaticDemo2 {
    public static void main(String[] args) {
        Doo d1 = new Doo();//此时会加载到方法区中
        Doo d2 = new Doo();//此时无需且不会再重复加载到方法区中
        Doo d3 = new Doo();//此时无需且不会再重复加载到方法区中
        System.out.println(Doo.a);//这种情况也是可以使用类的加载
    }
}

class Doo{
    public static int a=10;//静态变量 属于类
    Doo(){
        System.out.println("Doo的构造方法执行了");
    }
    static{//静态代码块，当本类被加载到方法区时是被执行
        System.out.println("Doo的静态代码执行了...");
    }
}
