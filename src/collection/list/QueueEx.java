package collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

  public static void main(String[] args) {
    //Queue는 인터페이스이기 때문에 큐의 구현체인 LinkedList로 생성
    Queue<Integer> queue_int = new LinkedList<Integer>();
    Queue<String> queue_string = new LinkedList<>();

    queue_int.add(1); //큐에 1 추가
    queue_int.offer(2); //큐에 2 추가
    System.out.println(queue_int);

    queue_int.poll(); //큐에서 추출. 이후 큐에서 삭제함
    System.out.println(queue_int); //[2]

    queue_int.offer(3);
    queue_int.offer(3);
    queue_int.offer(3);
    queue_int.remove(3); //[2,3,3]
    System.out.println(queue_int);
  }

}
