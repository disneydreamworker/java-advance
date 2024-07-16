package stream_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import lambda.innerclass2.A;

public class PredicateEx {

  public static void main(String[] args) {

    //자바에서 제공하는 Predicate 함수형 인터페이스를 통해 간단히 테스트 가능 -> 함수형 인터페이스를 따로 구현하고 람다식으로 만들어서 할 필요 X
    Predicate<Integer> isPositive = n -> n > 0 ;

    System.out.println(isPositive.test(5));
    System.out.println(isPositive.test(-5));

    //

    List<Integer> numbers = Arrays.asList(-3,-2,-1,0,1,2,3,-4,4);
    List<Integer> positiveNumbers = filter(numbers, isPositive);

    System.out.println(positiveNumbers);
    positiveNumbers.forEach(System.out::println);

  }
    //양수만 저장하는 filter 직접 만들어보기
    public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
      List<T> filterList = new ArrayList<>();

      for (T t : list) {
        if (predicate.test(t)) {
          filterList.add(t);
        }
      }

      return filterList;
    }
}
