package lambda.day2;

public class LamdaDay2 {

  //익명 구현 객체
  public static void action(LamdaDay2Ex01 calculable){
    calculable.calculate(10, 20);
  }

  public static void main(String[] args) {

    //action 메서드는 람다식을 이용하여 내부 데이터를 처리한다
    //여러 람다식을 만들어 여러 개의 처리부를 만들 수 있다
    action(
        (x, y) -> {
          int result = (x + y);
          System.out.println(result);
        }
    );

    action(
        (x,y)->{
          int result = x * y;
          System.out.println(result);
        }
    );

  }
}
