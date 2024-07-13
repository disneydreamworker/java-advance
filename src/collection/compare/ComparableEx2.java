package collection.compare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparableEx2 {

  public static void main(String[] args) {
    Set<Person> people = new TreeSet<>(); //TreeSet은 자동 정렬을 해주지만 그 대상은 포장 클래스만 가능하다

    people.add(new Person("김", 70));
    people.add(new Person("김", 50));
    people.add(new Person("이", 30));
    people.add(new Person("박", 10));
    people.add(new Person("남", 20));
    people.add(new Person("조", 20));


    for (Person person : people){
      System.out.println(person.getName() + " " + person.getAge());
    }

  }
}
