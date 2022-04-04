package OO.day04;

/**
 * 测试成员内部类
 * */

public class TestDemo {
    public static void main(String[] args) {
        Mama a = new Mama();
//        Baby b = new Baby(); 内部类对外不具备可见性
    }
}

class Mama{//外部类
    private int a=10;
    void action(){
        Baby b = new Baby();//外部类可以创建内部类对象
    }
    class Baby{//内部类
        void test(){
            a=10;//隐式写法 Mama.this.a=10;
            action();//外部类可以共享内部类的属性和方法
        }
    }
}