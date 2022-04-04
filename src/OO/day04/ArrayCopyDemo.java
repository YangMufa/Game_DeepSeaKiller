package OO.day04;

import java.util.Arrays;

/**
 * 数组拷贝的方法
 * 1、Arrays.copyOf ----基于源数组扩容或缩容的情况下使用
 * 2、System.arraycopy ----存在两个数字的情况下使用，例如将A数组拷贝到B数组时
 */
public class ArrayCopyDemo {
    public static void main(String[] args) {
        //Arrays.copyOf
        int [] array={};
        int [] array1={1};
        System.out.println("扩容前的对象地址："+array+",长度："+array.length);
        /**
         * copuOf
         *       1、要扩容的数组
         *       2、扩容的长度
         */
        //扩容以后会产生新的数组对象，此时需要影响原数组需要进行赋值覆盖才能得到扩容后的新数组
        array=Arrays.copyOf(array,array.length+1);
        System.out.println("扩容后的对象地址："+array+",长度："+array.length);

        for (int i = 1; i <= array1.length; i++) {
            array1 = Arrays.copyOf(array1,array1.length+1);
            array1[array1.length-1]=i;
            System.out.println("array1="+array1[i]);
            if (i == 10) {
                break;
            }
        }
        System.out.println("---------------------------");
    }
}
