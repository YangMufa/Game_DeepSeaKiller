package OO.day03;

/**
 * 静态的使用演示类
 */
public class StaticDemo {
    static int i=0;
    public static void main(String[] args) {
        Coo c1=new Coo();
        c1.show();//显示ab的值
        Coo c2=new Coo();
        c2.show();//显示ab的值
        Coo c3=new Coo();
        c3.show();//显示ab的值
        Coo.method();
        c3.method();
    }
}

class Coo{
    int a;//实例变量，属于对象
    static int b;//静态变量，属于类

    static void method(){
        System.out.println(b);
        System.out.println("我是静态方法，不需要对象也能调用！");
        StaticDemo.i++;
//        System.out.println(this.a);//静态的方法没有this传递，无法访问this相关成员
//        show();//this.this
    }

    Coo(){
        a++;
        b++;
    }
    void show(){
        System.out.println("a的值为："+a+"b的值为："+b);
    }
}
