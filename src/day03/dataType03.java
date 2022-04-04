package day03;

class dataType03 {
    public static void main(String[] args) {
        //类型转换:byte→short→int→long→float→double→
        //大小   :127→3万+→21亿→900万万亿→很大→超大→

        //1、自动类型转换：将小的类型装载到大的类型的过程
        int a = 100;//直接量值100赋给int a 没有发生类型转换
        long b = a;//发生了自动类型转换，b类型不变
        //2、强制类型转换：将大的类型装载到小的类型的过程，可能会出现溢出
        long c = 1000000000L;//十亿
        a=(int)c;//强转语法在需要强转转换的变量前面加上小括号填上强转的类型
        System.out.println("a=："+a);
        //3、被强转变量的值大于目标类型的最大宽度时数据会溢出
        long d = 3000000000L;
        int e = (int)d;
        System.out.println("e=："+e);//一定不等于30000000000得到的是溢出的乱值


        //1、整数直接量可以赋值给 byte short char

        byte a1=1;
        byte b1=2;
        byte c1=(byte)(a+b);
        char d1='2';//50
        char e1='2';//50
        int f1=d1+e1;//char运行时本质上是运行对应的ASCII码
        System.out.println("\nc1=："+c1);
        System.out.println("f1=："+f1);
        byte g1=100;
        int h1=g1+20;//byte小类型与int大类型运算结果为大类型
        System.out.println("h1=："+h1);












    }
}

