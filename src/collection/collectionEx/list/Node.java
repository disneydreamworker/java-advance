package collection.collectionEx.list;

//노드 만들어보기
public class Node<T> {
  T data;
  //다음 노드를 가리키는 포인터 역할
  Node<T> next = null;

  // 생성자
  public Node(T data) {
    this.data = data;
  }
}
