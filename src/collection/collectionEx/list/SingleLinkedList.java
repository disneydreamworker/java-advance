package collection.collectionEx.list;

public class SingleLinkedList<T> {

  //head 멤버 변수
  public Node head = null;


  //노드 추가하기
  public void addNode(T data) {
    //head가 null 이면 첫번째 노드
    if (head == null) {
      head = new Node(data);
    } else {
      Node<T> node = this.head;
      while (node.next != null) {
        node = node.next;
      }
      node.next = new Node<T>(data);
    }
  }

  public class Node<T> {
    T data;
    Node<T> next = null;

    public Node(T data) {
      this.data = data;
    }
  }

  public void printAll(){
    if (head != null) {
      Node<T> node = this.head;
      System.out.println(node.data);
      while(node.next != null) {
        node = node.next;
        System.out.println(node.data);
      }
    }
  }

  //특정한 데이터의 노드를 찾기
  public Node<T> search (T data) {
    if (this.head == null) {
      return null;
    } else {
      Node<T> node = this.head; //시작 노드 지정
      while(node != null) { //모든 노드를 돌면서
        if (node.data == data) { //data가 같다면 노드 리턴
          return node;
        } else {
          node = node.next; //다음 노드로 순회
        }
      }
    }
    return null;
  }

  //노드 추가하기
  public void addNodeInside(T data, T isData) {
    Node<T> searchedNode = this.search(isData);

    if (searchedNode != null) {
      Node<T> nextNode = searchedNode.next;
      searchedNode.next = new Node<T>(data); //추가할 애는 내 바로 뒤
      searchedNode.next.next = nextNode; //원래 내 뒤에 있던 애는 내 뒷뒷자리
    } else if (searchedNode == null) {
      this.addNode(data);
    }
  }

  //노드 삭제하기
  public boolean delNode (T isData) {
    if(this.head == null){
      return false;
    } else {
      Node<T> node = this.head;

      if(node.data == isData){
        this.head = this.head.next;
        return true;
      } else {
        while (node.next != null) {
          if(node.next.data == isData) {
            node.next = node.next.next;
            return true;
          }
          node = node.next;
        }
      }
    }
    return false;
  }
}
