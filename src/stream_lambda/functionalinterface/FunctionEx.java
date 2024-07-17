package stream_lambda.functionalinterface;

import java.sql.SQLOutput;
import lambda.day3.Person2;

//++함수형 인터페이스++//
//함수를 변수처럼 선언해서 사용하는 개념
//간결한 코드 가능
@FunctionalInterface
interface Func {
  int max(int n1, int n2);
}
public class FunctionEx {

  public static void main(String[] args) {
  //순수 함수 : 람다식으로 생성된 함수. 함수형 인터페이스로만 선언이 가능함
  Func func = (int a, int b) -> a > b ? a:b;
    System.out.println(func.max(7,10));
  }

}
