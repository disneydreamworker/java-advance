package lambda.day02.anonymous;

class Animal {
    public String eat(){
       return "먹이를 먹다.";
    }
}

class Dog extends Animal{

  @Override
  public String eat() {
    return "강아지 얌얌";
  }
}

public class AnimalEx{

  public static void main(String[] args) {
         Animal dog = new Dog();
         dog.eat();

  }

}
