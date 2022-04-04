package day07;

import java.util.Scanner;

public class ArrayDaemo {
    public static void main(String[] args) {
//        int[]arr;
//        int[]arr1;
//        int[]arr2;
//        int[]arr3;
//        char[]arr4;
//        arr4=new char[3];
//        System.out.println(arr4[0]);
//        System.out.println(arr4[1]);
//        System.out.println(arr4);
        inpuyScores();

    }

    /**  需求: 通过在控制台的方式 录入10学生成绩 存入数组中. int[] scores = new int[10];
     *      例如: 请输入第 1 名同学的成绩?
     *            100
     *            请输入第2 名同学的成绩?
     *            19
     *            请输入第3 名同学的成绩?
     *            ....
     *            请输入第10名同学的成绩?
     *            100
     *            录入完毕!
     *            再去依次遍历数组显示成绩.
     *            输出10名同学的平均成绩 :  总成绩 / 总人数
     * */
    public static void inpuyScores() {
        int[] scores = new int[10];//开10块地 用来存成绩
        Scanner s = new Scanner(System.in);//创建一个扫描器
        int sum = 0;//记录总成绩
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第"+ (i+1) + "名同学的成绩");
            //scores[i] 代表访问数组的每一块地,从第一块直至最后一块
            scores[i] = s.nextInt();//接受数据 存给scores
            sum += scores[i];//累加成绩 存给sum
        }
        System.out.println("录入完毕");
        System.out.println("班级的平均成绩:"+ sum / scores.length  );
    }

}


