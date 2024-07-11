package generic.interfaceEx.question;

public class Main {
  public static void main(String[] args) {
    // 냉장고 렌탈 및 구매 예시
    Refrigerator fridge = new Refrigerator();
    fridge.rent(); // 냉장고를 렌탈합니다.
    fridge.purchase(); // 냉장고를 구매합니다.
    fridge.rent(); // 냉장고는 이미 렌탈 중이거나 구매되었습니다.


  }

}
