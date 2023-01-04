package inputoutputpackage;

import java.io.*;

public class Iodemo {
    public static void main(String[] args) throws IOException {
//        int [] arr = {'%', '(', ')'};
////        for (int i = 0; i < 123; i++) {
////            System.out.println("The ASCII value is : "+(char)i+" : "+i);
////        }
////        for(int i = 0; i <arr.length; i++)
////        {
////            System.out.println(arr[i] +" " + (char)arr[i]);
////        }
//
        String s = "My name is Anthony Gonsalv";
//        byte a[] = s.getBytes();
//        for(byte j:a)
//        {
//            System.out.print(j + " ");
//        }
        File obj = new File("C:/Users/abhijit.s/Downloads/abc.txt");
        FileOutputStream fos = new FileOutputStream("C:/Users/abhijit.s/Downloads/abc.txt");
        FileInputStream fis = new FileInputStream(obj);




        byte a[] = s.getBytes();

        try {
          //  for(byte i:a)
            {
                fos.write(a);// if the file is not empty this statement will override the4 content of the file. To save that
                // we need to read the file and save it first, then start writing to it

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Data entered successfully");

      //  System.out.println((char)fis.read());// reads the first character in Ascii, converts into char using explicit casting

        int x =0;
       while((x = fis.read()) != -1)// returns -1 when read reaches the end of file
       {
           System.out.print((char)x);
       }

       // then we can write FileInputStream fis = new FileInputStream(obj);;

        // readBytes, skip, available
    }
}