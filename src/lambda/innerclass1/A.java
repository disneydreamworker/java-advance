package lambda.innerclass1;

//이너클래스
//Class 안에 Class를 만들어서 긴밀한 관계를 만들어 상호작용하기 위해 중첩 클래스를 생성한다
public class A {

  //인스턴스 멤버 클래스
  class B {
    int field = 10;
    static int field2 = 20;
    B(){
      System.out.println("B 클래스의 생성자가 실행되었습니다");
    }
  }

    void userB(){
      B b = new B(); //자기 자신을 생성
      System.out.println(b.field);
      System.out.println(B.field2);
      System.out.println("B의 메서드 1 실행 완료");
    }

  //1
  //인스턴스 필드 값으로 B 객체 대입
  B bField = new B();

  //2
  //생성자
  A(){
    B b = new B();
  }

  //3
  //instance Method
  void method(){
    B b = new B();
  }

}
