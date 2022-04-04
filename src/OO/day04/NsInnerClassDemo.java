package OO.day04;

/**
 * 匿名内部类的测试类
 */

public class NsInnerClassDemo {

    public static void main(String[] args) {
        int b = 10;
        //使用匿名内部类的方式:
        //1.创建Aoo的子类 只不过没有名字
        //2.将当前这个没有子类对象 地址 赋值给了 a
        //3.花括号就是子类的类体!
        Aoo a = new Aoo() { //创建的匿名内部类的外部类是NsInnerClassDemo这个类
            //创建的匿名内部类的父类是 Aoo这个类
            @Override
            public void show() {
//                b = 100; 匿名内部类无法修改外部类的属性的
//                System.out.println(b); 匿名内部类使用外部类属性会默认为 final
                System.out.println("匿名内部类重写Aoo的show方法");
            }
        };
        a.show();
        //常规的重写
//        Boo b = new Boo();
//        b.show();
    }
}

class Aoo { //-----作为父类
    public void show() {
        System.out.println("Aoo这个父类的show方法");
    }

}

//常规的重写
class Boo extends Aoo { //构建父子关系
    @Override
    public void show() {
        System.out.println("Boo子类重写父类的show方法");
    }
}
