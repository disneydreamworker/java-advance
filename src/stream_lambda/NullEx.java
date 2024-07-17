package stream_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NullEx {

  public static void main(String[] args) {
       /* String str = null;
        if(str == null){
          System.out.println("폭탄  null");
        } else{
          System.out.println(str);
        }*/

      List<String> nameList = Arrays.asList("BBB","CCC","AAA","DDD");

     //Option 클래스는 제너릭타입을 사용하여 값의 타입을 지정한다.

    //1-1) 존재 여부에 따른 처리
     String value = "Hello Optional";
     String value1 = null;

     //1-1-1. Optional.of(value) Optional 객체 생성 한다.
    Optional<String> optionalS = Optional.of(value);

     //1-1-2. Optionals의 객체의 값의 유무 확인
    if(optionalS.isPresent()){
      System.out.println(optionalS.get());
    }
    optionalS.ifPresent(System.out::println);

    //2 Null 처리 방법
    Optional<String> optionalS1 = Optional.ofNullable(value1);

    //2-1 orElse 를 사용해서 null 인경우 기본값 반환, null이 아닌경우 결과값 반환
    String result = optionalS1.orElse("반갑습니다. null 처리 메세지 입니다.");
    System.out.println(result);

  }

}
