package lambda.innerclass1;

//Nested Class - 로컬 클래스
//생성자와 메서드 안에서 생성되는 클래스
public class CC {
  void userC(){
    class D{

      int field = 10;
      //JAVA 17 이상 부터 지원
      static int field2 = 20;


      D(){
        System.out.println("생성자 생성 함");
      }

      void method1 (){
        System.out.println("method1 실행 완료");
      }

      //JAVA 17 이상 부터 지원
      static void method2() {
        System.out.println("method2 실행 완료");
      }
    }

    //로컬 클래스 객체 생성
    D d = new D();

    System.out.println(d.field);
    d.method1();
    D.method2();
    System.out.println(D.field2);
  }
}
