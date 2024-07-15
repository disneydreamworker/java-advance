package lamda.innerclass;

//Nested Class - 로컬 클래스
//생성자와 메서드 안에서 생성되는 클래스
public class C {
  //생성자 인스턴스 로컬 클래스 생성
  C(){
    class D{
    }
    D d = new D();
  }

  //메서드 인스턴스 로컬 클래스 생성
  void method(){
    class D {}

    D d = new D();
  }
}
