import java.util.Random;
import java.util.Scanner;

public class TestDemo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rd = random.nextInt(20) + 1;
        System.out.println("产生的随机数是：" + rd);
        int count = 0;
        while (count < 3) {
            System.out.println("请输入一个数");
            int sc = scanner.nextInt();
            count++;
            if (count < 3) {
                if (sc > rd) {
                    System.out.println("输入的数大了");
                } else if (sc < rd) {
                    {
                        System.out.println("输入的数小了");
                    }
                } else {
                    System.out.println("恭喜，猜对了");
                    break;
                }
            } else {
                System.out.println("很遗憾，超过次数");
            }
        }
    }
}
