package day03;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class dateType02 {
    public static void main(String[] args){
        //小数的直接量默认为double类型
//        double a = 3.14;//声明一个double类型的变量a 存了3.14
//        double b = 3.0;
//        double c = 2.9;
//        System.out.println(b - c);//0.10000000000000009
//        double e = 6.0;
//        double f = 4.9;
//        System.out.println(e - f);//1.0999999999999996
//        double g = 6.0;
//        double h= 1.9;
//        System.out.println(g - h);//4.1
//        System.out.println(Math.round(g+h));//四舍五入
//        char temp = 'a';//声明一个char变量temp 存字符a
////        char temp1 = 'fa';//编译错误：char只能存单个值
//        temp='杨';
//        char temp2='\'';
//        char temp3='\\';
//        System.out.println("temp："+temp+"\n");
//        System.out.println("杨 ASCII码："+(int) temp);//打印出对应的ASCII码
//        System.out.println("木 ASCII码："+(int) '木');//打印出对应的ASCII码
//        System.out.println("发 ASCII码："+(int) '发');//打印出对应的ASCII码
//        System.out.println();
//        System.out.print((char) 26472);//打印出ASCII码对应的字符
//        System.out.print((char) 26408);//打印出ASCII码对应的字符
//        System.out.println((char) 21457+"\n");//打印出ASCII码对应的字符
//        System.out.println("temp2: "+temp2);//打印出ASCII码对应的字符
//        System.out.println("temp3: "+temp3);//打印出ASCII码对应的字符

        boolean a=true;
        System.out.println(a);
        boolean b=false;
        System.out.println(b);
        System.out.println("\n"+(int)'a');//char可以转换成int
//        System.out.println("\n"+(int)a);//boolean不能转换成int

    }
}