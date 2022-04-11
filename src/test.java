import static java.lang.Character.getType;

public class test {
    public static void main(String[] args) {




/**
 * 赋值运算符是从右向左求值的，先计算j++然后返回值是0，j的值变为1，然后0又被赋值给j，j的值变为0
 */
//int j=0;
//for(int i=0;i<100;i++){
//    j=j++;
////    j+=j;
//
//}
//System.out.println(j);





















    }
    public static String getType(Object o) { //获取变量类型方法
        return o.getClass().toString(); //使用int类型的getClass()方法
    }
}
