package dataIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//파일 카피하기//
public class CopyImageEx {

  public static void main(String[] args) throws IOException {
    //상대 경로 와 절대 경로

    String original = "C:/Temp/picture.jpg";
    String targetFileName = "C:/Temp/picture_copy.jpg";

    //리소스 로 부터 데이터를 읽어서 해당 디렉토리의 리소스로 카피

    InputStream is = new FileInputStream(original);
    OutputStream os = new FileOutputStream(targetFileName);

    //업글 전
    byte[] buffer = new byte[1024];

    while(true) {
      int data = is.read(buffer); //읽은 바이트는 data로 처리

      if (data == -1) break; //-1이 되면 끝남

      os.write(buffer, 0, data); //읽은 바이트 수 만큼 파일을 쓴다
    }


    //업글 후
    is.transferTo(os); //자바 9부터 지원 입력 스트림에서 출력 스트림으로 바이트를 복사하는 기능

    os.flush();
    os.close();
    is.close();
    System.out.println("copy complete");
  }
}
