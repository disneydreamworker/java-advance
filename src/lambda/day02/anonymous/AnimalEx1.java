package lambda.day02.anonymous;

class Animal1 {

  public String eat() {
    return "먹이를 먹다.";
  }
}


public class AnimalEx1 {

  public static void main(String[] args) {
    //익명 클래스
    Animal1 dog = new Animal1() {

      @Override
      public String eat() {
        return "강아지 얌얌";
      }
    };

   String str =  dog.eat();


  }

}
