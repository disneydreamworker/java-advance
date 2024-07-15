package lamda.day02.innerInterface;

public class Button {

  public static interface ClickListner {

    void onClick();
  }

  //setter 메서드를 이용하여 ClickListner 구현 객체를 injection
  private ClickListner clickListner;

  public void setClickListner(ClickListner clickListner) {
    this.clickListner = clickListner;
  }

  //버튼이 클릭되었을때, 실행할 메소드
  public void click() {
    this.clickListner.onClick();
  }

}
