package day07;

public class MethodDemo5 {

    public static void main(String[] args) {

        int [] ar={100,60,30,20,1000};
        System.out.println("返回最大值："+max(ar));
    }

    public static int max(int []ar) {
        int max=0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max=ar[i];
            }
        }
        return max;
    }
}
