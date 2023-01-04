package inputoutputpackage;
import java.io.*;

public class mark_resetdemo {
    private static java.io.ByteArrayOutputStream ByteArrayOutputStream;

    public static void main(String[] args) throws IOException {
        OutputStream fos = new FileOutputStream("C:/Users/abhijit.s/Downloads/xyz.txt");
        OutputStream fos1 = new FileOutputStream("C:/Users/abhijit.s/Downloads/abc.txt");
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        byte a[] = {97,98,99,100,101, 102};
        ByteArrayInputStream bis = new ByteArrayInputStream(a);
        char a1 = (char)bis.read();
        char a2 = (char)bis.read();

        char a3 = (char)bis.read();
        System.out.println(a1 +"" + a2+"" + a3);
        bis.mark(2);
        char a4 = (char)bis.read();
        char a5 = (char)bis.read();
        bis.reset();
        char a6 = (char)bis.read();

        System.out.println(a1 + "" +a2+""+a3+""+a4 + "" +a5+""+a6);

    }
}
