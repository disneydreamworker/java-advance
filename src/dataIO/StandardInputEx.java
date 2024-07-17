package dataIO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StandardInputEx {

  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("입력하세요");
      String name = br.readLine();
      System.out.println("입력 확인 : " + name);

      br.close();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
