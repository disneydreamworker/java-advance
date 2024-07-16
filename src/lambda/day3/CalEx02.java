package lambda.day3;

public class CalEx02 {

  public static void main(String[] args) {
    //Person 클래스의 객체를 생성하고 Computer의 메서드를 사용
    Person user = new Person();

    //정적 메서드 참조
    user.action(Computer :: adder);
    user.action(Computer::multiply);

    //인스턴스 메서드를 사용 -> Computer 객체 필요
    Computer com = new Computer();
    user.action(com::adderInstance);
    user.action(com::adderInstance);

  }

}
