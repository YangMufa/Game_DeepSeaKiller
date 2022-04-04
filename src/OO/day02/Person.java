package OO.day02;

/**
 * 人类---代表学生类、老师类、医生类的父类，
 * 存放共有的属性和方法
 */
public class Person {
    String name; //姓名
    int age;//年龄
    char sex;//性别
    void eat(){//吃
        System.out.println("干了五碗");
    }
    void sleep(){//睡
        System.out.println("碎觉了");
    }
    void sayHi(){//打招呼
        System.out.println("hello,my name is"+name+",今年"+age+"岁，性别"+sex);
    }

    Person(){}

    Person(String name,int age,char sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
}
