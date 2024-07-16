package lambda.day3;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class ConstructorMemberEx {

  public static void main(String[] args) {
  Person2 user = new Person2();

  Member m1 = user.getMember1(Member :: new);
    System.out.println(m1.getId());
    Member m2 = user.getMember2(Member :: new);
    System.out.println(m2.getName() + m2.getId());


    //5

  }

}
