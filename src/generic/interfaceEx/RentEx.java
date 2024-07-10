package generic.interfaceEx;

import java.nio.charset.CoderMalfunctionError;

public class RentEx {

  public static void main(String[] args) {
    Codi codi = new Codi();
    AirConditionMachine airConditionMachine = codi.rent();
    airConditionMachine.powerOn();
  }
}
