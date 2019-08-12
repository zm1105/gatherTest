import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        getForEachList(list);
        System.out.println("============");
        getForList(list);
        System.out.println("============");
        getIteratorList(list);
    }

    @Test
    //for循环遍历List集合
    public static void getForList(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Test
    //迭代器遍历List集合
    public static void getIteratorList(List list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }

    @Test
    //增强for遍历List集合
    public static void getForEachList(List list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
