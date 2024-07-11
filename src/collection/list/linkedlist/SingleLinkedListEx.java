package collection.list.linkedlist;

public class SingleLinkedListEx {

  public static void main(String[] args) {
/*    Node<Integer> node1 = new Node<Integer>(1);
    Node<Integer> node2 = new Node<Integer>(2);
    node1.next = node2;
    Node<Integer> head = node1;*/
    SingleLinkedList<Integer> mylist = new SingleLinkedList<>();
    mylist.addNode(1);
    mylist.addNode(2);
    mylist.addNode(3);
    System.out.println(mylist.head.data); //1
    System.out.println(mylist.head.next.data); //2
    System.out.println(mylist.head.next.next.data); //3

    //특정한 값을 담고 있는 노드 찾기
    mylist.search(3);
    mylist.printAll();
    System.out.println("-----------------");
    //노드 추가하기
    mylist.addNodeInside(4, 2);
    mylist.printAll();
    System.out.println("-----------------");
    //노드 삭제하기
    mylist.delNode(4);
    mylist.printAll();
    System.out.println("-----------------");
  }
}
