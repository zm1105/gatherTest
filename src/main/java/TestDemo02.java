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
            if (sc > rd) {
                count++;
                if (count < 2) {
                    System.out.println("输入的数大了");
                } else if (count > 2) {
                    System.out.println("对不起，输入的次数超出限制");
                }
            } else if (sc < rd) {
                count++;
                if (count < 2) {

                    System.out.println("输入的数小了");
                } else if (count > 2) {
                    System.out.println("对不起，输入的次数超出限制");
                }
            } else {
                System.out.println("恭喜，猜对了");
                break;
            }
        }
    }
}
