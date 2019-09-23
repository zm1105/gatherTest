import java.io.FileOutputStream;
import java.io.PrintWriter;

public class TestDemo06 {
    //新增一个文件并写入内容
    public static void main(String[] args) {
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream("d:/abd.text"));
            String name = "zhoumin";
            out.print(name);
            out.close();
        } catch (Exception e) {
        }
    }
}
