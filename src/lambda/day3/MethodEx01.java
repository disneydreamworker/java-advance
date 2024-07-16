package lambda.day3;

public class MethodEx01 {

  public static void main(String[] args) {
    Person1 user = new Person1();
    user.ordering(String :: compareToIgnoreCase);
    user.ordering((name1, name2) -> {
      return name1.compareToIgnoreCase(name2);
    });
  }
}
