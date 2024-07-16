package lambda.day03;

//Person 클래스가 계산기를 이용해서 계산을 한다.
public class Person {

  public static void action(Calculable calculable) {


    int x = 10;
    int y = 20;
    //x, y : 데이터 처리 메소드에게 데이터를 보낸다.
    int result = calculable.calculate(x, y);
    System.out.println(result);
  }
}
