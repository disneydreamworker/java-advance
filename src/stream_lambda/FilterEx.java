package stream_lambda;

import java.util.ArrayList;
import java.util.List;

public class FilterEx {

  public static void main(String[] args) {
    List<String> List = new ArrayList<>();
    List.add("강아지");
    List.add("강아지");
    List.add("강아지");
    List.add("고양이");
    List.add("거북이");
    List.add("거북이");

    List.stream().distinct().forEach(System.out::println);

    List.stream().filter(list -> list.startsWith("강")).forEach(System.out::println);

    List.stream().distinct().filter(list -> list.startsWith("강")).forEach(System.out::println);

  }
}
