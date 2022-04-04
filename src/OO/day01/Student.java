package OO.day01;
//OO 面向对象

/**
 * 学生类模板：代表所有学生对象
 * 类中放所有学生对象共有的属性（变量）和行为（方法）
 *
 * 成员变量（全局变量）：声明在类里面方法外面的变量，作用域在整个类中
 * 局部变量：声明在方法里的变量都叫局部变量，作用域在方法里
 *
 * 生类模板:  代表所有学生对象
 * 类中放所有学生对象共有的属性(变量)和行为(方法)
 * 模板中不要放main 功能
 *
 */
/**
 * 学生类模板:  代表所有学生对象
 * 类中放所有学生对象共有的属性(变量)和行为(方法)
 * 模板中不要放main 功能
 */
public class Student {
    //共有的属性   成员变量作用域在整个类体中
    String name;//姓名
    int age;//年龄
    int stuID;//学号

//    Student(String name,int age,int stuID){//构造方法初始化变量
//        this.name=name;//this指代的是当前对象
//        this.age=age;//局部变量可以和全局变量名一样
//        this.stuID=stuID;
//    }
//
//    Student(){//无参构造方法
//
//    }
//
//    //共有的行为
//    void study() {//学习的行为
//        int a = 0;//方法声明的变量为局部变量 作用域只在当前方法中可见
//        System.out.println(name + "在刻苦学习...");
//    }
//
//    void sayHi() {
//
//        System.out.println("大家好，我叫" + name + ",今年" + age + "岁了,我的学号是:" + stuID);
//
//    }




}