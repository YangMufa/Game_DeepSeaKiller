package OO.day05;

/**
 * 类型转换测试demo
 */
public class ClassCastDemo {
    public static void main(String[] args) {
        Aoo1 ao1 = new Boo1();//说明父new子，ao1中存的是Boo这个类型的对象
        Boo1 bo1 = (Boo1)ao1;//符合条件一，要强转的变量引用，就是这个类型
        InterA ia =(InterA) ao1;//要强转的变量引用，实现了接口类型或继承了该类
        if (ao1 instanceof Coo1) {
            System.out.println("ao1是Coo这个类型");
            Coo1 coo1 = (Coo1) ao1;
        }
    }
}
interface InterA{}
class Aoo1{}
class Boo1 extends Aoo1{}
class Coo1 extends Aoo1{}