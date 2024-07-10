package generic.interfaceEx;

public interface Rentable<P> {  //다양한 대상을 렌트하기 위한 rent()메소드의 리턴 타입을 타입파리미터 P로 지정
  public P rent();

}
