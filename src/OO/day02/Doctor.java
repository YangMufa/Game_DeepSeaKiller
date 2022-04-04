package OO.day02;

/**
 * 医生类
 * 存放了自己特有的属性和行为
 */
public class Doctor extends Person {
    int level;//职称
    //
    void cut(){//手术

    }

    @Override
    void sayHi(){
        System.out.println("我叫"+name+"我是一名医生，我的职称是"+level);
    }

    Doctor(String name,int age,char sex,int level){
        super(name,age,sex);
        this.level=level;
    }

}
