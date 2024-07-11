package collection.list;

import java.util.ArrayList;

public class MyQueue <T> {

  private final ArrayList<T> queue = new ArrayList<T>();

  public void enqueue(T item) {
    queue.add(item);
  }

  public T dequeue() {
    if (queue.isEmpty()) {
      return null;
    }

//    T queues;
//    queues = queue.remove(0);
//    System.out.println(queues);

    return queue.remove(0);
  }

  public boolean isEmpty(){
    return queue.isEmpty();
  }

  public static void main(String[] args) {
    MyQueue<Integer> myqueue = new MyQueue<>();
    myqueue.enqueue(1);
    myqueue.enqueue(2);
    myqueue.enqueue(3);
    myqueue.enqueue(4);
    myqueue.enqueue(5);
    System.out.println(myqueue.dequeue());
    System.out.println(myqueue.dequeue());
    System.out.println(myqueue.dequeue());
    System.out.println(myqueue.dequeue());
    System.out.println(myqueue.dequeue());
  }
}
