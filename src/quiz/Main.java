package quiz;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    //Q1
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    int evenSum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
    System.out.println(evenSum);

    //Q2


    //Q2-2


    //Q3.
    try {
      BufferedReader br = new BufferedReader(new FileReader("C:/Temp/data.txt"));
      int linesCnt = 0;
      while(br.readLine()!=null){
        linesCnt++;
      }
      System.out.println("파일의 줄 수 : "  + linesCnt);
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    //Q4
    List<Integer> numbers2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    int allSum = numbers2.stream().mapToInt(Integer::intValue).sum();
    System.out.println(allSum);


    //Q5
    List<Integer> numbers3 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    numbers3.stream().filter(n-> n%2==0).mapToDouble(Math::sqrt).sum();
  }

  //Q2
  @FunctionalInterface
  interface MakeString {
    void mstr();
  }
}
