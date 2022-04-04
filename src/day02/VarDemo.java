package day02;

public class VarDemo {
    public static void main(String[] args) {
        //声明变量
        int a;
        int b,c,d;
        //初始化变量
        a=20;
        int e = a;
        // 使用变量
        System.out.println(e+a);

        /*
         *当前方法里同名方法只能声明一次。
         * 未初始化变量不能直接拿来使用。
         * 不能先使用后声明，程序是从上往下执行。
         */

        /*变量的命名规范
        * 变量名只能以数字、字母、_、$ 不能以数字开头（int 8; 报错）
        * 变量名严格区分大小写（int A;int a; 不是同一个变量）
        * 变量名不能以关键字来进行命名（turn,fals,int,float,char,long,string等等）
        * 变量名要见名之意
        * 尽量不要用中文命名和使用驼峰命名法
        * */




    }
}
