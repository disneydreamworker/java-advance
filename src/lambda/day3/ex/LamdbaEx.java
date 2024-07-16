package lambda.day3.ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class LamdbaEx {
  static int add = 0;

  public static void main(String[] args) {
    List<Integer> mmlists = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    //5.
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }
    //식을   람다식으로 변경

    //1. intStream
    IntStream.rangeClosed(0,10).forEach(value -> System.out.println(value));
    IntStream.rangeClosed(0,10).forEach(System.out::println);
    //2. for each
    list.forEach(System.out::println);


    //6.
    int sum;
    int[] arr = {1, 2, 3, 4, 5};
    sum = Arrays.stream(arr).sum();
    System.out.println("합 : " + sum);

    //람다식

    mmlists.stream().forEach(i -> add += i);


    //7. foreach 람다 형식을 이용하여 List 출력하기
    mmlists.stream().forEach(m -> System.out.println(m));
    mmlists.forEach(System.out::println);

    //8
    // for와 if를 이용하여 홀수에 대한 제곱의 합 구하기
    int sum2 = list.stream().filter(number -> number % 2 == 1).reduce(0, Integer::sum);
    System.out.println(sum2);

    //9. stream을 이용하여 홀수의 합 구하기


  }
}