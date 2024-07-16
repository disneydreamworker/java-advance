package lambda.innerclass1;

public class DD {
  public void method3(int n){ // final int n
    int var = 1; // = final int var
  // 로컬 변수를 로컬클래스에서 사용할 경우 로컬변수는 final특성을 부여한다.
  //값을 읽을 수만 있고, 값을 수정할 수 없도록 제한 (로컬 클래스 내부에서 값을 변경불가 하도록 제한한다.)

    //위 method3의 로컬 변수는
    class E {
      void method4(){
        //method3의 로컬 변수 사용 가능!
        System.out.println(n + " 은 n 입니다.");
        System.out.println(var + " 은 var 입니다.");

        //로컬 클래스에서는 로컬 변수의 값을 수정할 수 없다
        //var = 2;
      }
    }

    //로컬 객체 생성
    E e = new E();
    e.method4();

  }

}
