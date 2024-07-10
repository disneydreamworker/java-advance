package generic.genericmethodEx;

import generic.classEx.Gift;

public class GenericBoxEx {

  public static void main(String[] args) {
    //Integer형 담기
    Box<Integer> boxResult = boxing(100);
    //언박싱
    int value = boxResult.getType();
    System.out.println(value);

    //String형 담기
    Box<String> boxString = boxing("포켓몬 포토카드");
    //언박싱
    String str = boxString.getType();
    System.out.println(str);

    //클래스 담기
    Box<Gift> boxGift = boxing(new Gift());
    String giftName = boxGift.getType().name;
    String giftCompany = boxGift.getType().company;
    System.out.println(giftName + " " + giftCompany);
  }

  public static <T> Box <T> boxing(T t) {
    Box<T> box = new Box<>();
    box.setType(t); //타입 전달
    return box;
  }
}
