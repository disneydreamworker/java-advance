package dataIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileWriterEx01 {

  public static void main(String[] args) {
    try {
      FileOutputStream fs = new FileOutputStream("C:/Temp/data.txt");
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fs));
      bw.write("writer~~!");
      bw.newLine();
      bw.write("hey ho");
      bw.newLine();
      bw.write("hohoho");

      bw.close();
      fs.close();

      FileInputStream fi = new FileInputStream("C:/Temp/data.txt");
      //필터 스트림
      //실질적인 read 기능은 inputstreamReader
      BufferedReader br = new BufferedReader(new InputStreamReader(fi));

      String line;

      while((line = br.readLine()) != null ) {
        System.out.println(line);
      }
      br.close();
      fi.close();

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
