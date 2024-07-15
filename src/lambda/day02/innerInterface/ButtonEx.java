package lambda.day02.innerInterface;

public class ButtonEx {

  public static void main(String[] args) {

      Button okbtn = new Button();

      class OKListener implements Button.ClickListner {

        @Override
        public void onClick() {
          System.out.println("OK 버튼 클릭!");
        }
      }

      okbtn.setClickListner(new OKListener());
      okbtn.click();

      //Cancel 버튼 생성

      //Cancel 버튼 클릭 이벤트를 처리할 ClickListner 클래스 구현

      //구현 클래스 setting

      //cancel 버튼 클릭

    Button Cancelbtn = new Button();

    class CancelListener implements Button.ClickListner {

      @Override
      public void onClick() {
        System.out.println("Cancel 버튼 클릭!");
      }
    }

    Cancelbtn.setClickListner(new CancelListener());
    Cancelbtn.click();


  }

}
