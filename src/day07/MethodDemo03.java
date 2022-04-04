package day07;

public class MethodDemo03 {
    public static void main(String[] args) {
        double pi = getPi();
        System.out.println(pi);
        double r=Math.random();
        System.out.println(r);
    }

    //无参数 有返回值
    static double getPi(){
        //返回 数据的类型要与方法的返回值定义类型 匹配
        return 3.1415926;
    }

}
