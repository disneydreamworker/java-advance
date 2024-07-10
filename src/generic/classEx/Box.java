package generic.classEx;

public class Box <T> {
  //타입을 특정할 수 없어서 Object로 설정.
  //Box 클래스의 멤버로는 다양한 형태가 저장될 수 있으므로 특정 클래스 타입으로 선언할 수 없다.
  //모든 클래스의 최상위 부모 클래스로 자동 프로모션 되므로 content 필드에는 어떤 객체도 대입할 수 있다.
//  public Object content;

  //Box가 인스턴스되기 전까지 어떤 타입이 올 지 몰라 T로 지정
  //인스턴스 시 타입이 결정됨
  public T content;
}
