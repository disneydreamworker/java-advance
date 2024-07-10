package generic.genericmethodEx;


public class Box <T> {
  private T type;

  //제너릭 메서드 Get, Set 생성
  public T getType(){
    return type;
  }

  public void setType(T type) {
    this.type = type;
  }
}
