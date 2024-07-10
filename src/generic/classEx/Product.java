package generic.classEx;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product <K,M>{
  //파라미터로 여러 개 가능 : 다양한 종류의 클래스를 재사용하여 사용가능 해짐
  //타입 파라미터로 받은 K를 kind 필드의 타입으로 사용
  private K kind;

  //타입 파라미터로 받은 M를 model 필드의 타입으로 사용
  private M model;

}
