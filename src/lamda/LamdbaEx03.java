package lamda;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface  FindMax{
  int getMax(List<Integer> numbers);
}


public class LamdbaEx03 {
  /*
   *  1.  정수 리스트를 받아 정수를 반환하는 단일 추상 메서드 getMax()를 사용하여 FindMax 인터페이스를 생성하세요
   *  2.  정수 리스트를 반복하고 최대값을 찾는 람다식을 구현합니다.
   *  3.  최대값은 Integer.MIN_VALUE 로 설정 한 후 더 놓은 숫자가 나타나면 업데이트 합니다.
   *      최대값은 변수 max에 저장 합니다.
   *  4.  정수리스트를 생성합니다.
   *  5.  max 객체에서 getMax() 호출하여 최대값을 출력합니다.
   * */

  public static void main(String[] args) {
FindMax max = (numbers) -> {
         int maxNumber = Integer.MIN_VALUE;
         for(int number : numbers){
           if(number > maxNumber){
             maxNumber = number;
           }
            }
         return maxNumber;
};

 List<Integer> numberList = new ArrayList<>();
 numberList.add(10);
 numberList.add(20);
 numberList.add(30);
 numberList.add(0);
 numberList.add(100);
 int maxValue = max.getMax(numberList);
    System.out.println(maxValue);

  }

}

