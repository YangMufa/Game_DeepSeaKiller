package OO.day02;

public class OverrideDemo {
    public static void main(String[] args) {
        Doo d =new Doo();
        d.show();
        d.show(5);
        d.show(6.5);
    }
}

class Coo{
    void show(){}
}

class Doo extends Coo{
    @Override
    void show() {}//重写：参数列表相同、方法名相同

    void show(int a) {}//重载：方法名相同、参数列表不同
    void show(double b){}//重载
}