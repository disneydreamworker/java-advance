package collectionEx.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DiffEx {   //ArrayList 와 LinkedList 객체 추가 성능평가

  public static void main(String[] args) {
      // ArrayList  list1, LinkedList list2 객체 생성
    List<String> list1 = new ArrayList<>();
    List<String> list2 = new LinkedList<>();

    //시작 시간 과 끝 시간을 저장할 변수 선언
    long startTime;
    long endTime;

    startTime = System.nanoTime();
    for(int i = 0; i<10000;i++){
      //list1.add(0,String.valueOf(i));
      list1.add(String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.printf("%-15s %8s ns \n","ArrayList 걸린 시간 : " ,  (endTime - startTime));

    System.out.println("========LinkedList===========");
    startTime = System.nanoTime();
    for(int i = 0; i<10000;i++){
      //list2.add(0,String.valueOf(i));
      list2.add(String.valueOf(i));

    }
    endTime = System.nanoTime();
    System.out.printf("%-15s %8s ns \n","LinkedList 걸린 시간 : " ,  (endTime - startTime));

  //ArrayList는 0번 인덱스에 새로운 객체가 추가되면서 기존 객체의 인덱스를 한 칸씩 미루는 작업을 해야 하므로, 전체 작업시간이 오래 걸린다.





  }
}
