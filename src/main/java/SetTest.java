import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    @Test
    //迭代器遍历Set集合
    public void getIteratorSet(){
        Set set =new HashSet();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("赵六");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    //for循环遍历Set集合
    public void getForSet() {
        Set set = new HashSet();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("赵六");
        for (Object o : set) {
            System.out.println(o);
        }
    }
}

