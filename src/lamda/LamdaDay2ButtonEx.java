package lamda;

public class LamdaDay2ButtonEx {

  public static void main(String[] args) {

    //인터페이스에 실제 객체를 입력하는 것을 Injection이라고 한다
    LamdaDay2Button button = new LamdaDay2Button();

    button.setClickLister(
        ()->{
          System.out.println("버튼이 클릭되었습니다.");
        }
    );

    button.click();
    button.click();
    button.click();
    button.click();
    button.click();

    LamdaDay2Button cancelbutton = new LamdaDay2Button();
    cancelbutton.setClickLister(
        ()->{
          System.out.println("cancle 버튼이 클릭되었습니다.");
        }
    );

    cancelbutton.click();
  }
}
