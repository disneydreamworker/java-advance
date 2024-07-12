package lamda;

import java.util.List;
import java.util.Arrays;
public class LamdaEx01 {

  public static void main(String[] args) {
    //List 컬렉션에 10개의 정수를 저장하고 짝수의 합을 구하기

    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10); //Array 관련 기능을 처리하는 static

    //lamda
    int sumEven = list.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();

    System.out.println(sumEven);
  }
}
