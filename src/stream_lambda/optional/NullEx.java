package stream_lambda.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NullEx {
  //+OPTIONAL CLASS+//
  public static void main(String[] args) {
    List<String> namelist = Arrays.asList("BBb", "CCC", "AAA", "DDD", "EEE");

    //Optional 은 제너릭 타입을 사용해서 값의 타입을 지정한다
    String value = "Hello Optional!";
    String value2 = "gna";

    //1. of
    Optional<String> optional1 = Optional.of(value);

    //1-1. isPresent
    boolean isPresent = optional1.isPresent();
    if (isPresent) {
      System.out.println(optional1.get());
    }

    //2. ifPresent : 람다
    optional1.ifPresent(System.out::println);

    //3. ofNullable : 값이 null인 경우에도 Optional 클래스 생성
    Optional<String> optional2 = Optional.ofNullable(value2);

    //4. orElse : null이 아니면 값을 출력, null이면 other 안의 값 출력
    System.out.println(optional2.orElse("null처리 메세지."));

  }
}
