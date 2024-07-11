package collection.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DiffEx {

  public static void main(String[] args) {
    //ArrayList와 LinkedList의 객체 추가 성능 비교

    List<String> list1 = new ArrayList<>();
    List<String> list2 = new LinkedList<>();

    //시작 시간, 끝 시간 저장 변수 선언
    long startTime;
    long endTime;

    //ArrayList가 걸린 시간
    startTime = System.nanoTime();
    for (int i = 0; i < 1000; i++) {
      list1.add(0, String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.printf("%8s ns \n", endTime - startTime); //345800 ns

    System.out.println("-----------");

    //LinkedList 걸린 시간
    startTime = System.nanoTime();
    for (int i = 0; i < 1000; i++) {
      list1.add(0, String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.printf("%8s ns \n", endTime - startTime); //62300 ns
  }
}
