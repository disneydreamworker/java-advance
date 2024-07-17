package dataIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteOutputStreamEx01 {

  public static void main(String[] args) throws IOException {
    OutputStream outputStream = new FileOutputStream("C:/Temp/test.txt"); //디렉토리
    OutputStream outputStream2 = new FileOutputStream("C:/Temp/test2.txt"); //디렉토리
    byte a = 10;
    byte b = 20;
    byte c = 10;

    outputStream.write(a); //버퍼 저장소가 있어서, 우선 버퍼에 저장한 후 하나씩 값을 저장하고 출력함.
    outputStream.write(b);
    outputStream.write(c);

    outputStream.flush(); //다 쓰면 내부 버퍼를 비워야 쓰레기 값이 안나옴
    outputStream.close();

    //
    byte[] bytes={10,20,30};
    outputStream2.write(bytes);
    outputStream2.write(bytes, 1, 2);
    outputStream2.flush();
    outputStream2.close();
  }
}
