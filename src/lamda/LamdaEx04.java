package lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaEx04 {

  //내부 익명 클래스 => 람다식으로 표현
  public static void main(String[] args) {
    //////****문제 1*****////
    List<String> names = Arrays.asList("Zendaya", "Timothy", "Charlotte", "Norman", "Amy",
        "Sunshine");
    //익명 클래스
    Collections.sort(names, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.compareTo(o2);
      }
    });
    //람다식 표현
    Collections.sort(names, (a, b) -> a.compareTo(b));

    for (String name : names) {
      System.out.println(name);
    }

    //////****문제 2*****////
    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    int sum = integers.parallelStream().filter(number -> number % 2 == 0)
        .mapToInt(number -> number * number).sum();

    System.out.println(sum);
  }
}
