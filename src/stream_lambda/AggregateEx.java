package stream_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AggregateEx {

  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    List<Integer> list = Arrays.asList(1,2,3,4,5);


    //내부 주입
    //long sum = Arrays.stream(array).sum();

    double avg = Arrays.stream(array).average().getAsDouble();
    //Optional
    double avg2 = Arrays.stream(array).average().orElseThrow();

    int max = Arrays.stream(array).max().getAsInt();

    int min = Arrays.stream(array).min().getAsInt();

    int first = Arrays.stream(array).filter(n -> n % 2 == 0).findFirst().getAsInt();

  }
}
