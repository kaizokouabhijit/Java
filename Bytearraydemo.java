package inputoutputpackage;
import java.io.*;

public class Bytearraydemo {
    private static java.io.ByteArrayOutputStream ByteArrayOutputStream;

    public static void main(String[] args) throws IOException {
        OutputStream fos = new FileOutputStream("C:/Users/abhijit.s/Downloads/xyz.txt");
        OutputStream fos1 = new FileOutputStream("C:/Users/abhijit.s/Downloads/abc.txt");
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write(97);
        bos.writeTo(fos);
        bos.writeTo(fos1);
        bos.flush();
        byte a[] = {97,98,99,100};
        ByteArrayInputStream bis = new ByteArrayInputStream(a);


        int x = 0;
        while((x = bis.read()) !=-1)
        {
            System.out.print((char)x + " ");
        }



    }
}
