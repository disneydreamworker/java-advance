package dataIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ByteInputStreamEx01 {

  public static void main(String[] args) throws IOException {
    InputStream inputStream = new FileInputStream("C:/Temp/test2.txt");

    byte[] dataBytes = new byte[1024];

    while (true) {
      int data = inputStream.read(dataBytes);
      if (data == -1) {
        break;
      }

      for (int i = 0; i < data; i++) {
        System.out.println(dataBytes[i]);
      }
    }
    inputStream.close();
  }
}
