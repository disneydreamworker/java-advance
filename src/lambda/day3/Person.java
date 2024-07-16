package lambda.day3;

//Calculable 함수형 인터페이스를 사용
//매개 변수가 존재하는 람다
public class Person {
  //함수형 메서드
  public static void action(Calculable2 calculable) {
    int x = 10;
    int y = 20;
    //사람이 직접 결과를 확인
    int result = calculable.action(x, y);
    System.out.println(result);
  }
}
