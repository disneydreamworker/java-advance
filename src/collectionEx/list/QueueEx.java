package collectionEx.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

  public static void main(String[] args) {
    Queue<Integer> queue_int = new LinkedList<Integer>(); // Integer형 큐 생성
    Queue<String>  queue_string = new LinkedList<String>();  //String 형 큐 생성
    queue_int.add(1);
    queue_int.offer(2);
    queue_int.offer(3);

    System.out.println(queue_int);
    Integer result = queue_int.poll();
    System.out.println(queue_int);
    System.out.println(result);
    queue_int.remove();
    System.out.println(queue_int);
    boolean result1 =queue_int.remove(2);
    System.out.println(result1);
  }

}