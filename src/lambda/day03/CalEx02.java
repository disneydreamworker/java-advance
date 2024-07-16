package lambda.day03;

import java.util.Arrays;
import java.util.List;

public class CalEx02 {

  public static void main(String[] args) {

    Person user = new Person();
       //user은 컴퓨터의 덧셈기를 이용하여 두 수를 더하여 결과를 확인합니다.
      Person.action(Computer :: adder);  //static 메소드 adder 참조


      //user은 컴퓨터의 곱셈기(multiply)를 이용하여 두 수를 곱한 결과를 확인합니다.
       Computer com  = new Computer();
       user.action(com :: multiply);   //Computer 인스턴스 메소드 multiply 참조

     List<Integer> list = Arrays.asList(1,2,3,4,5);
     list.forEach(System.out::println);
  }

}
