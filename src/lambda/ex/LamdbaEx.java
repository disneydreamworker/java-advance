package lambda.ex;

import java.sql.Statement;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class LamdbaEx {
  static int sum1;

  public static void main(String[] args) {

    //1. IntStream 방식
    IntStream.rangeClosed(1,10).forEach((int value)->System.out.println(value));

    //2. foreach 방식
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    list.forEach(System.out::println);

    int sum = 0;
    int[] array = {1,2,3,4,5};
    sum = Arrays.stream(array).sum();
    System.out.println("합 = " + sum);


     List<Integer> list1 = Arrays.asList(1,2,3,4,5);
     list.stream().forEach((i -> sum1 +=i));
     System.out.println(sum1);

     //Collection에 담긴 객체를 처리하는 반복자 3가지
     //1. iterator  구성 방식
     //2. stream 구성 방식
     //3. while(iter.hasNext() == true) { Object next = iter.next(); }

    List<Integer> mmlists = Arrays.asList(1,2,3,4,5);
    mmlists.stream().forEach(m -> System.out.println(m));
    mmlists.forEach(System.out::println);

    List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8,9);
    int total = 0;
    for(Integer odd : list2){
      if(odd %2 == 1) {
          total = odd * odd;
      }
    }
    System.out.println("total = " + total);

    //stream 이용하여 홀수의 합을 구하는 방식

    total = list2.stream().filter(d -> d%2==1).reduce(0, Integer::sum);
    System.out.println(total);




  }

}
