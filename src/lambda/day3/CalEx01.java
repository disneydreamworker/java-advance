package lambda.day3;

import static java.lang.Integer.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CalEx01 {

  //익명 객체..함수형 메서드?
  public static void action(Calculable calculable) {
    System.out.println("숫자를 입력하세요.");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    sc.nextLine();
    int y = sc.nextInt();

//    String data1 = processData((BufferedReader br) -> br.readLine());

    //데이터 처리 메서드에게 데이터를 보낸다
    calculable.action(x, y);
  }

  //실행 어라운드 패턴 구현 -> BufferedReaderProcessor 통해 입력을 받는다
  public static String processData() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    return null;
  }

  public static void main(String[] args) {
    //action 익명 객체
    action((x, y) -> {
      System.out.println(x + y);
    });
    action((x, y) -> {
      System.out.println(x * y);
    });

    //실행 어라운드 패턴 구현

    Person user = new Person();
    Person.action((x,y)->(x+y));
    Person.action((x,y) -> sum(x,y));
    Person.action(
        (x,y) -> {
          return sum(x,y);
        }
    );

    //sum 메서드를 재정의 가능
//    public static int sum(int x, int y) {
//      return (x + y);
//    }

  }
}
