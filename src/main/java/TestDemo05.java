public class TestDemo05 {

    public static void main(String[] args) {
        String str = "asdfer";
        String str2 = "abcdefg";
        getstr(str);
        getstr(str2);
        getnum(100);

    }

    /**
     * (1)使用for循环对s="asdfer"进行循环，但是每次打印的内容都是"asdfer"。
     * (2)使用for循环对s="abcdefg"进行循环，每次打印的内容是每个字符加上sb，	例如：asb, bsb，csb,...gsb。
     */
    private static void getstr(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s);
        }
        for (int j = 0; j < s.length(); j++) {
            System.out.println("" + s.charAt(j) + "sb");
        }
    }

    /**
     * 计算 1 - 2 + 3 - 4 + ... + 99 中除了88以外所有数的总和？
     */
    private static void getnum(Integer integer) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < integer; i++) {
            if (i % 2 != 0) {
                odd = odd + i;
            } else if (integer % 2 == 0) {
                if (i == 88) {
                    continue;
                } else if (i != 88) {
                    even = even + i;
                }
            }
        }
        System.out.println("奇数和是" + odd);
        System.out.println("偶数和是" + even);
        System.out.println("1到99除掉88以外奇数和减偶数和"+" "+(odd-even));

    }
}
