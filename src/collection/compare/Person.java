package collection.compare;

import java.util.Comparator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
//public class Person implements Comparable<Person> {
public class Person implements Comparator<Person> {
  private String name;
  private int age;

  //Comparable : Person 클래스 내부에 구현 해야함
//  @Override
//  public int compareTo(Person o) {
//    if (this.getAge() == o.getAge()) return 0;
//    else if (this.getAge() < o.getAge()) return -1;
//    else return 1;
//  }

  //Comparator : Person 클래스 외부에서 Comparator 클래스를 만들어 구현할 수 있음
  @Override
  public int compare(Person o1, Person o2) {
    if (o1.getAge() == o2.getAge()) return 0;
    else if (o1.getAge() < o2.getAge()) return -1;
    else return 1;
  }
}
