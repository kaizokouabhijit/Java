package inputoutputpackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Printstreamdemo {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("C:/Users/abhijit.s/Downloads/abc.txt");
        PrintStream ps = new PrintStream(fos);
        ps.print(true);
        char arr[] = {'a', 'b', 'c'};
        String x = "ABC";
        ps.print(arr);
        ps.format("Welcome %s" ,x);

    }
}
