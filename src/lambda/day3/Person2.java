package lambda.day3;

public class Person2 {

  //람다식을 생성자 참조로 대체하기
  public Member getMember1(CreateIdMember createIdMember){
    String id = "ssg-manager";
    Member member = createIdMember.create(id);
    return member;
  }

  public Member getMember2(CreateIdNameMember createIdNameMember){
    String id = "ssg-manager";
    String name = "ssg-manager-name";

    Member member = createIdNameMember.create(id, name);
    return member;
  }
}

