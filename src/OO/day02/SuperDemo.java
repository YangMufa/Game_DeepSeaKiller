package OO.day02;

/**
 * 父与子构造方法的测试类
 */
public class SuperDemo {
    public static void main(String[] args) {
        Boo b = new Boo();//创建boo子类对象
    }
}

class Aoo{//父类
    String name="";
    Aoo(){
        System.out.println("父类AOO的 无参 构造方法");
    }
    Aoo(int a){
        System.out.println("父类AOO的 有参 构造方法");
    }
}
class Boo extends Aoo{//子类
    Boo(){
        super();
//        super(44);
        super.name="我好帅";
        System.out.println("super.name="+"我好帅");
        System.out.println("子类BOO的参构造方法");
    }
}