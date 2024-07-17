package dataIO;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;


//리팩토링//
public class FileReaderEx01 {

  public static void main(String[] args) throws IOException {

    Stream<String> stream;

    //Path Class 와 stream을 사용하여 데이터를 읽기 (BufferedReader 보다 간결)
    Path path = Path.of("C:/Temp/data.txt");

    stream = Files.lines(path, Charset.defaultCharset());

    stream.forEach(System.out::println);

    stream.close();


    //File Class
    File file = path.toFile();

    FileReader fr = new FileReader(file);

    BufferedReader br = new BufferedReader(fr); //보조 스트림

    stream = br.lines();
    stream.forEach(System.out::println);
    stream.close();
  }
}
