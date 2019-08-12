public class TestDemo05 {
    /**
     * (1)使用for循环对s="asdfer"进行循环，但是每次打印的内容都是"asdfer"。
     * (2)使用for循环对s="abcdefg"进行循环，每次打印的内容是每个字符加上sb，	例如：asb, bsb，csb,...gsb。
     */
    public static void main(String[] args) {
        String str = "asdfer";
        String str2 = "abcdefg";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str);
        }
        for (int j =0;j<=str.length();j++){
            System.out.println(""+str2.charAt(j)+"sb");
        }
    }

}
