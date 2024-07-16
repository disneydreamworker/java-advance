package lambda.anonymous;

class Animal1 {

  public String eat() {
    return "먹이를 먹다";
  }
}


public class AnimalEx1 {

  public static void main(String[] args) {

    //익명 클래스
    //Dog 클래스를 생성하지 않고도 메서드를 오버라이딩해서 바로 사용할 수 있다
    Animal1 dog = new Animal1() {
      @Override
      public String eat() {
        return "강아지 홀짝";
      }
    };

    //익명 클래스
    Animal1 dog2 = new Animal1() {

      @Override
      public String eat() {
        return "강아지 얌얌";
      }
    };

    String result = dog.eat();
    System.out.println(result);
  }
}
