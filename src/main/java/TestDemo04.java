public class TestDemo04 {
    public static void main(String[] args) {
        String s = "123a4b5c";
        //1)通过对s切片形成新的字符串s1,s1 = "123"
        System.out.println(s.substring(0, 3));
        //2)通过对s切片形成新的字符串s2,s2 = "a4b"
        System.out.println(s.substring(3, 6));
        //5)通过对s切片形成字符串s5,s5 = "c"
        System.out.println(s.substring(s.length() - 1, s.length()));
        System.out.println(s.charAt(s.length() - 1));
        char c = s.charAt(1);
        char c1 = s.charAt(3);
        char c2 = s.charAt(5);
        //4)通过对s切片形成字符串s4,s4 = "2ab"
        System.out.println("" + c + c1 + c2);
        //通过对s切片成字符串s6,s6 = "ba2"
        System.out.println("" + c2 + c + c1);
        getnum(s);
    }

        //3)通过对s切片形成新的字符串s3,s3 = "1345"
    private static void getnum(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 48 && str.charAt(i) < 57) {
                str2 += str.charAt(i);
            }
        }
        System.out.println(str2);
    }
}
