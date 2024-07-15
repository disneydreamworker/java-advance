package lamda;

public class LamdaDay2Button {
//함수형 인터페이스 정의
  @FunctionalInterface
  public static interface ClickLister{void onClick();}

  private ClickLister clickLister;

  public void setClickLister(ClickLister clickLister){this.clickLister = clickLister;}

  public void click(){clickLister.onClick();}
}
