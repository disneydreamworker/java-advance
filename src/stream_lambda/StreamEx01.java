package stream_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamEx01 {

  public static void main(String[] args) {
    //Stream Example 1
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> liststream = list.stream().filter(number -> number % 2 == 0).toList();
    //List<Integer> liststream = list.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
    liststream.forEach(System.out::println);

    //Stream Example 2
    //boxed : IntStream -> List<Integer> 형변환
    List<Integer> list2 = IntStream.rangeClosed(1, 10).filter(number -> number % 2 == 0).boxed()
        .toList();
    list2.forEach(System.out::println);

    //Stream Example 3
    List<String> list3 = List.of("apple, banana, orange, grape");
    list3.stream().map(String::toUpperCase).forEach(System.out::println);
    //APPLE, BANANA, ORANGE, GRAPE
    list3.forEach(System.out::println);
    //apple, banana, orange, grape

    //Stream Example 4
    List<String> list4 = Arrays.asList("Count how many words exist in this sentence", "This is an example of Stream", "Welcome to my house let's get something!");
    list4.stream().mapToInt(set -> set.split("\\s+").length).forEach(System.out::println);

  }
}
