package OO.day03;

/**
 * 测试final的类
 */
public class FinalDemo {
    private int a;//声明一个所有属性变量
    private final int b=100;//声明成员变量用final修饰时必须初始化，且不能修改

    public static void main(String[] args) {


    }

    public void fun() {
//        b=200;//编译错误：final修饰的变量不允许二次修改
        final int d;//声明final的局部变量
        d=100;//声明final的局部变量可以二次赋值
    }

}

final class Aoo {//父类 final修饰的类不能被子类继承
    final  void action(){
        //
    }
}

//    class Boo extends Aoo(){}//不能继承用final修饰的父类
