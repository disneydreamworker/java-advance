package generic.interfaceEx;

public class WaterMachine implements Rentable{
  public void powerOn(){
    System.out.println("공기청청기 전원을 켭니다.");
  }

  @Override
  public Object rent() {
    return null;
  }
}
