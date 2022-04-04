package OO.day02;

/**
 * 学生类
 * 存放了自己特有的属性和行为
 */
public class Student extends Person {//学生类继承了 人类
    //学生对象共有的数据
    int stuID=0;//学号
    //共有的行为
    void study(){//学习

    }

    @Override
    void sayHi() {
        System.out.println("我叫"+name+"我是一名学生，我的学号是"+stuID);
    }

    Student(String name,int age,char sex,int stuID){
        super(name,age,sex);
        this.stuID=stuID;
    }
}
