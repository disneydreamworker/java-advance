package generic.interfaceEx;

public class Codi implements Rentable<AirConditionMachine>{

  @Override
  public AirConditionMachine rent() {
    AirConditionMachine airConditionMachine = new AirConditionMachine();
    return airConditionMachine;
  }
}
