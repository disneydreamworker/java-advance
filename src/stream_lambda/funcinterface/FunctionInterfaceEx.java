package stream_lambda.funcinterface;

/*@FunctionalInterface
public interface Suppiler<T>{
  T get();
}*/

/*@FunctionalInterface
public interface Consumer<T>{
  void accept(T t);

  default Consumer<T> andThen(Consumer<? super T> after){
    Object.requiredonNull(after);
    return (T t) -> {accept(t); after.accept(t);};
  }

}*/


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionInterfaceEx {

  public static void main(String[] args) {
    Supplier<String> supplier = ()->"Hello Supplier!";
    System.out.println(supplier.get());

    Consumer<String> consumer = (str -> System.out.println(str.split(" ")[0]));
    consumer.andThen(System.out::println).accept("Hello ssg.com");

    Function<String , Integer> function = String::length;
    System.out.println(function.apply("Hello Function Interface!"));

    Predicate<String> predicate = (str->str.equals("very pretty"));
    System.out.println(predicate.test("pretty"));

  }

}
