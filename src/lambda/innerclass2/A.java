package lambda.innerclass2;

public class A {
  //A 클래스의 멤버
  int field1;
  void method1(){}

  //정적 멤버
  static int field2;
  static void method2(){}

  //인스턴스 멤버 클래스
  class B{
    void method(){
      //A class의 멤버 사용
      field1 = 1;
      method1();
      field2 = 1;
      method2();
    }
  }

  static class C{
    void method(){
//      field1 = 2;
//      method1();
      field2 = 2;
      method2();
    }
  }
}
