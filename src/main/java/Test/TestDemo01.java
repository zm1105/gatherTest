package Test;

import java.util.Scanner;

public class TestDemo01 {
    public static void main(String[] args) {
        //判断一个数是否是质数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int num = sc.nextInt();

        //定义一个标记变量
        boolean b = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                b = true;
            }
        }
        String str = b ? "不是质数" : "是质数";
        System.out.println("这个数" + str);
    }
}
