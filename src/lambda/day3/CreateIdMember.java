package lambda.day3;

@FunctionalInterface
public interface CreateIdMember {
  //id를 이용하여 Member 클래스 생성하고 리턴
  Member create(String id);
}
