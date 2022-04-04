package day07;

public class MethodDemo02 {
    public static void main(String[] args) {
        sayHi("木发");
    }

    //返回值类型 方法名称(){ 方法代码块}
    //定义
    static void sayHi(String name){
        System.out.println(name+"同学你好");
    }
}
