package lamda.day02.innerclass1;

public class ABEx {

  public static void main(String[] args) {

      //A 객체 생성
      A a = new A();

      //B객체 생성
      //A.B b = a.new B();
       A.B b = a.new B();
       //b.userB();

       a.userB();
  }

}
