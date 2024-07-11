package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx01 {

  public static void main(String[] args) {
/*    Set<String> set = new HashSet<>();

    set.add("아");
    set.add("아");
    set.add("아");
    System.out.println(set.size()); //1
    set.add("에");
    System.out.println(set.size()); //2*/

    Set<Member> memberlist = new HashSet<>();
    memberlist.add(new Member("ssg1", 50));
    memberlist.add(new Member("ssg2", 50));
    memberlist.add(new Member("ssg1", 40));
    memberlist.add(new Member("ssg1", 30));

    //enhaced for
    for (Member member : memberlist) {
      System.out.println(member.name + " " + member.age);
    }

    //iterator 출력하기
    //회원을 반복자를 이용해서 가져옴 => 매번 출력 순서이 다름
    Iterator<Member> iterator = memberlist.iterator();
    while (iterator.hasNext()) {
      Member member = iterator.next();
      //조건 추가 -> 특정 데이터 삭제하기 iterator.remove
      if (member.age == 40) {
        iterator.remove();
      }
      //조건 추가 -> 특정 데이터 삭제하기 HashSet.remove
      if (member.age == 30) {
        memberlist.remove(member);
      }
    }

    Iterator<Member> printMember = memberlist.iterator();
    System.out.println("삭제 후 결과 : ");
    while (printMember.hasNext()) {
      Member member = printMember.next();
      System.out.println(member.getName() + " " + member.getAge());
    }
  }
}
