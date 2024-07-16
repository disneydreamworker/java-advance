package lambda.innerinterface;

public class Button {


  public static interface ClickListner{
    void onClick();
    void cancleClick();
  }

  //Setter Injection = Field Injection
  //ClickListner 구현 객체를 Injection
  private ClickListner clickListner;

  public void setClickListner(ClickListner clickListner){
    this.clickListner = clickListner;
  }

  public void click(){
    this.clickListner.onClick();
  }

  public void cancleClick(){
    this.clickListner.cancleClick();
  }

}
