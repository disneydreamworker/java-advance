package stream_lambda.functionalinterface;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Supplier {

  public static void main(String[] args) {
    SupplierEx<String> supplier = () -> "Hello Supplier!";
    System.out.println(supplier.get());

    Consumer<String> consumer = (String -> System.out.println(String.split(" ")[0]));
    consumer.andThen(System.out::println).accept("Hi ssg.com");

    Function<String, Integer> function = String::length;
    System.out.println(function.apply("이것은 fuction 함수형 인터페이스입니다."));

    Predicate<String> predicate = (str -> str.equals("very Pretty"));
    System.out.println(predicate.test("very pretty"));
  }


  @FunctionalInterface
  public interface SupplierEx<T> {

    T get();
  }

//  @FunctionalInterface
//  public interface ConsumerEx<T> {
//    void accept(T t);
//
//    default Consumer<T> andThen(Consumer<? super T> after){
//      Object.requiredonNull(after);
//      return (T t) -> {accept(t); after.accept(t);};
//    }
//  }


}
