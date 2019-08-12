import java.util.LinkedList;
import java.util.List;

public class TestDemo03 {
    public static void main(String[] args) {
        getnum(100);
    }

    private static void getnum(Integer integer) {
        List list = new LinkedList();
        List list2 = new LinkedList();
        for (int i = 0; i <= integer; i++) {
            if (i % 2 != 0) {
                list.add(i);
            } else if (i % 2 == 0) {
                list2.add(i);
            }
        }
        System.out.println("1到" + integer + "的奇数是");
        ListTest.getForList(list);
        System.out.println("1到" + integer + "的偶数是");
        ListTest.getForList(list2);
    }
}
