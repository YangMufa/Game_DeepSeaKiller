package OO.day02;

/**
 * 继承测试类
 */
public class ExtendsDemo {
    public static void main(String[] args) {
        /**
         * 为当前老师类、学生类、医生类添加构造方法
         */
//        Student[] s = new Student[3];//创建学生类对象 赋值给
//        s[0]=new Student("小明",18,'男',0001);
//        s[1]=new Student("小王",19,'男',0003);
//        s[2]=new Student("小刘",18,'女',0004);
//        s[0].sayHi();
//        s[1].sayHi();
//        s[2].sayHi();
//        Teacher t = new Teacher("王老师",38,'男',9000);
//        t.sayHi();



        //向上造型：声明付类型的变量创建子类型的对象
        //基于继承才能实现的方式
        Person[] ps = new Person[5];
        ps[0]=new Student("小明同学",18,'男',1001);
        ps[1]=new Student("小王同学",19,'男',1003);
        ps[2]=new Student("小刘同学",18,'女',1004);
        ps[3]= new Teacher("王老师",38,'男',9000);
        ps[4]= new Doctor("杨医生",33,'男',17000);
        for (int i = 0; i < ps.length; i++) {
            //调用父方法 执行子对象
            //编译期间：调用父类的sayHi功能
            //运行期间：调用sayHi方法调用的数据取决于 当前对象是谁
            ps[i].sayHi();
        }
    }
}
