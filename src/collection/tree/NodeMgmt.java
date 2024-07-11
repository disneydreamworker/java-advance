package collection.tree;

public class NodeMgmt {
  /////////*****Inner Class Node*****//////////
  public class Node {

    public Node left;
    public Node right;
    public final int value;

    //생성자
    public Node(int data) {
      this.value = data;
      this.left = null;
      this.right = null;
    }
  }


  //Node class 멤버 변수//
  Node nodehead = null;
  /////////*****Inner Class Node*****//////////

  //메서드 : 노드 추가//
  public boolean insertNode(int data) {
    //케이스 1 : 노드가 하나도 없을 때
    if (this.nodehead == null) {
      this.nodehead = new Node(data);
    } else {
      //케이스 2 : 노드가 하나 이상 들어있을 때
      Node lookForNode = nodehead;

      while (true) {
        //케이스 2-1 : 부모 노드 보다 작은 값이라 왼쪽 노드에 위치해야 할 때
        if (data < lookForNode.value) {
          if (lookForNode.left != null) {
            lookForNode = lookForNode.left;
          } else {
            lookForNode.left = new Node(data);
            break;
          }
        } else {
          //케이스 2-2 : 부모 노드의 오른쪽 노드에 위치해야 할 때
          if (lookForNode.right != null) {
            lookForNode = lookForNode.right;
          } else {
            lookForNode.right = new Node(data);
            break;
          }
        }
      }
    }
    return true;
  }


}
