package Test;

public class TestDemo002 {
    public static void main(String[] args) {
        String s ="这些年一个人，风也过，雨也走，有过泪，有过错, 还记得坚持甚么，真爱过才会懂，会寂寞会回首，" +
                "终有梦终有你在心中。朋友一生一起走，那些日子不再有，一句话，一辈子，一生情，一杯酒。朋友不曾孤单过，" +
                "一声朋友你会懂，还有伤，还有痛，还要走，还有我";
        int num =0;
        for (int i=0;i<s.length()-1;i++){
            String substring = s.substring(i, i + 2);
            if (substring.equals("朋友")){
                num++;
            }
        }
            System.out.println("朋友出现的次数是："+num+"次");
    }
}
