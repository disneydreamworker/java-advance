package stream_lambda.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class OptionalAggregateEx {

  public static void main(String[] args) {
    //NoSuchElement Exception
    List<Integer> list = new ArrayList<>();

    //1. OptionalDouble : double형으로 받음
    OptionalDouble optional1 = list.stream().mapToInt(Integer::intValue).average();

    //1.1 isPresent
    if (optional1.isPresent()) {
      System.out.println(optional1.getAsDouble());
    } else {
      System.out.println("0.0"); //Default 처리
    }

    //2. OrElse : 바로 처리 가능해서 if절 없음
    double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0.0); //Optional 객체로 만들어진 결과값이 내부적으로 getAsDouble을 실행시켜서 double avg에 담긴다
    System.out.println(avg);
    System.out.println(optional1.orElse(0.0));

    //3. ifPresent()
    optional1.ifPresent(System.out::println);
    list.stream().mapToInt(Integer::intValue).average().ifPresent(avg1 -> System.out.println(avg1));
  }
}
