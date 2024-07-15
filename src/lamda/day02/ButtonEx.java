package lamda.day02;

public class ButtonEx {

  public static void main(String[] args) {
      Button btn = new Button();


      btn.setClickListener(
          ()->{
            System.out.println("버튼이 클릭되었습니다.");
          }
      );

      btn.click();
    btn.click();
    btn.click();
    btn.click();
    btn.click();
    Button Canclebtn = new Button();
    Canclebtn.setClickListener(
        ()->{
          System.out.println("Cancle 버튼이 클릭 되었습니다.");
        }
    );
    Canclebtn.click();
  }


}
