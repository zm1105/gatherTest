import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

    @Test
    //1、通过获取所有的key按照key来遍历
    public void getForMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("张三", "男");
        map.put("李四", "女");
        map.put("王五", "男");
        map.put("赵六", "女");
        for (String s : map.keySet()) {
            System.out.println("key是:" + s + " " + "Value是：" + map.get(s));
        }
    }

    @Test
    //2  Map.Entry<String, String>的加强for循环遍历输出键key和值value
    public void getEntryMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("张三", "男");
        map.put("李四", "女");
        map.put("王五", "男");
        map.put("赵六", "女");
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("key是:" + entry.getKey() + " " + "Value是：" + entry.getValue());
        }
    }

    @Test
    //3 Iterator遍历获取，然后获取到Map.Entry<String, String>，再得到getKey()和getValue()
    public void getIteratorMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("张三", "男");
        map.put("李四", "女");
        map.put("王五", "男");
        map.put("赵六", "女");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key是：" + entry.getKey() + " " + "Value是：" + entry.getValue());
        }
    }
}
