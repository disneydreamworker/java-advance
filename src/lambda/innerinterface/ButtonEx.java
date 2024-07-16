package lambda.innerinterface;

public class ButtonEx {

  public static void main(String[] args) {
    Button okayButton = new Button();

    class OkListener implements Button.ClickListner{

      @Override
      public void onClick() {
        System.out.println("오케이 버튼 클릭!");
      }

      @Override
      public void cancleClick() {
        System.out.println("cancle 버튼 클릭!");
      }
    }

    okayButton.setClickListner(new OkListener());
    okayButton.click();
    okayButton.cancleClick();
  }
}
