package OO.day02;

/**
 * 老师类
 * 存放了自己特有的属性和行为
 */
public class Teacher extends Person {
    double salary;//工资

    void teach(){//行为

    }
    void sayHi(){
        System.out.println("我叫"+name+"我是一名老师，我的工资"+salary);
    }
    Teacher(String name,int age,char sex,int salary){
        super(name,age,sex);
        this.salary=salary;
    }
}
