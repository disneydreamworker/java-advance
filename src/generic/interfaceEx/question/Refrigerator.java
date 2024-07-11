package generic.interfaceEx.question;


//Refrigerator 클래스는 Rentalable과 Purchasable 인터페이스를 모두 구현하여 렌탈과 구매 기능을 제공합니다.
public class Refrigerator implements Rentalable, Purchasable {
  private boolean rented;
  private boolean purchased;

  @Override
  public void rent() {
    if (!rented && !purchased) {
      System.out.println("냉장고를 렌탈합니다.");
      rented = true;
    } else {
      System.out.println("냉장고는 이미 렌탈 중이거나 구매되었습니다.");
    }
  }

  @Override
  public void returnItem() {
    if (rented) {
      System.out.println("냉장고를 반납합니다.");
      rented = false;
    } else {
      System.out.println("냉장고는 렌탈 중이 아닙니다.");
    }
  }

  @Override
  public void purchase() {
    if (!rented && !purchased) {
      System.out.println("냉장고를 구매합니다.");
      purchased = true;
    } else {
      System.out.println("냉장고는 이미 렌탈 중이거나 구매되었습니다.");
    }
  }
}