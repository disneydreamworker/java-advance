package stream_lambda;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StudentMain {

  public static void main(String[] args) {
    List<Student> students = Arrays.asList(new Student(90, "종국"), new Student(75, "수희"), new Student(88, "지영"));

    Stream<Student> studentStream = students.stream();

    IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());

    double average = scoreStream.average().getAsDouble();

    // 파이프라인 처리
    double average2 = students.stream().mapToInt(student -> student.getScore()).average().getAsDouble();

  }
}
