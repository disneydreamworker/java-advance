package lambda;

import java.util.Arrays;
import java.util.List;

public class LamdaEx03 {

  public static void main(String[] args) {
    //정수 리스트에서 최대값을 찾는 람다식
    FindMax findMax = maxNum -> {
      int max = Integer.MIN_VALUE;
      for (Integer num : maxNum) {
        max = Math.max(max,num);
      }
      return max;
    };

    //정수 리스트
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    //단일추 메서드 호출
    int result = findMax.getMax(list);

    System.out.println(result);
  }

  //단일 추상 메서드 인터페이스
  @FunctionalInterface
  interface FindMax {
    int getMax(List<Integer> nums);
  }
}
