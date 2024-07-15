package lamda;

public class LamdaDay2PersonWorkableEx {

  public static void main(String[] args) {
    LamdaDay2Person worker1 = new LamdaDay2Person();

    worker1.action(
        ()->{
          System.out.println("9시에 출근을 합니다.");
          System.out.println("10시부터 업무 회의를 합니다.");
          System.out.println("오후 6시에 퇴근을 합니다");
        }
    );

  }
}
