package Test;

public class TestDemo003 {
    /**
     * 过滤敏感词汇
     */
    public static void main(String[] args) {
        String [] a ={"枪","手榴弹","爆炸"};
        String s = new String("不要拿枪,我们去扔手榴弹引起爆炸");
        for (String s1 : a) {
             s = s.replace(s1, "**");
        }
        System.out.println(s);
    }
}
