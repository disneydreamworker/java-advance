package lambda.day03;

public class MethodEx01 {

  public static void main(String[] args) {
     Person1 user = new Person1();
     user.ordering(String :: compareToIgnoreCase);
     user.ordering((name1,name2)->name1.compareToIgnoreCase(name2));
  }

}
//사람의 이름 비교하기 위해 String 클래스의 인스턴스 메소드 compareToIgnoreCase() 메소드를 참조하여 사용
//메소드 참조
//name1 이 name2 보다 사전순으로 먼저 이면 음수 리턴, 동일하면 0 , name1이 name2보다  나중에 오면 양수 를 리턴