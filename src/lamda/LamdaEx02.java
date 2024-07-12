package lamda;

public class LamdaEx02 {

  //함수형 인터페이스 예제
  //람다식과 함께 사용
  public static void main(String[] args) {
    //////****문제 1*****////
    //두 정수의 합을 반환하는 람다식
    ExampleClass addition = (a, b) -> a + b;

    //함수형 인터페이스 인스턴스 생성 operate() 메서드 호출 결과를 반환한다
    int result = addition.operate(5, 5);
    System.out.println(result);

    //////****문제 2*****////
    System.out.println("---------------------------");
    //문자열의 길이를 반환하는 람다식
    StringOperation stringLength = (a, b) -> a.length() + b.length();

    //함수형 인터페이스 인스턴스 생성 operate() 메서드 호출 결과를 반환한다
    int result2 = stringLength.operate("감사합니다", "고맙습니다");
    System.out.println(result2);

    //////****문제 3*****////
    System.out.println("---------------------------");
    //정수 배열의 짝수의 합을 반환하는 람다식
    ArrayOperation evenSum = numbers -> {
      int sum = 0;
      for (int num : numbers) {
        if(num%2==0) sum += num;
      }
      return sum;
    };

    int[] array = {1,2,3,4,5,6,7,8,9,10};
    int result3 = evenSum.operate(array);
    System.out.println(result3);


  }

  @FunctionalInterface // <- annotion으로 함수형 인터페이스임을 인증(선택사항)
  interface ExampleClass {
    int operate(int a, int b);
  }

  @FunctionalInterface
  interface StringOperation {
    int operate(String a, String b);
  }

  @FunctionalInterface
  interface ArrayOperation {
    int operate(int[] numbers);
  }
}
