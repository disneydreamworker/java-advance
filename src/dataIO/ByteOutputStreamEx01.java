package dataIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteOutputStreamEx01 {

  public static void main(String[] args) throws IOException {
    OutputStream outputStream1 = new FileOutputStream("C:/Temp/test.txt");
    OutputStream outputStream2 = new FileOutputStream("C:/Temp/test2.txt");
    byte a = 10;
    byte b = 20;
    byte c = 30;
    outputStream1.write(a);
    outputStream1.write(b);
    outputStream1.write(c);
    outputStream1.flush();
    outputStream1.close();
    byte[] bytes = {10,20,30};
    outputStream2.write(bytes,1,2);
    outputStream2.flush();
    outputStream2.close();

  }

}
