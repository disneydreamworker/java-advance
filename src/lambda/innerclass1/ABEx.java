package lambda.innerclass1;

public class ABEx {

  public static void main(String[] args) {
    //A 객체 생성
    A a = new A();

    //B 객체 생성
    //A의 내부 클래스이기 때문에 A클래스가 먼저 생성된 후 B를 호출한다
    //이때 내부적으로 람다가 동작한다
    A.B b = a.new B();
    //b.userB();

    a.userB();
  }
}
