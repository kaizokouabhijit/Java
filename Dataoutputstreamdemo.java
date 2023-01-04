package inputoutputpackage;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Dataoutputstreamdemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:/Users/abhijit.s/Downloads/abc.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.write(97);
        dos.writeChars("Hello");
        dos.flush();

    }
}
