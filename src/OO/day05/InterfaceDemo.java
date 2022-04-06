package OO.day05;

public class InterfaceDemo {
    public static void main(String[] args) {
        Boo boo = new Boo();
        boo.test();
    }
}

interface Inter1 {//接口
    //访问权限中默认 public
    //抽象方法不能有方法体
    //不能被创建对象
    //接口需要被实现类/子类实现的，一但实现类或子类实现了接口，那么必须实现该接口中的使用功能
    //一个类可以实现多个接口，实现时需要通过 implements来实现，在后面加上接口名
    // 一个子类继承了一个父类的情况下去实现一个接口需要先继承在实现 （clas Boo extends Aoo implements Intface）
    int num = 10;//在接口中默认是常量 等同于 static final int NUM=10;
    abstract void test();
}

class Aoo{
    //
}
class Boo extends Aoo implements Inter1{
    @Override
    public void test() {
        System.out.println("实现了Interf1接口的test方法");
    }
}