package collection.tree;

public class BinaryTreeEx {

  public static void main(String[] args) {
    NodeMgmt tree = new NodeMgmt();
    tree.insertNode(10);
    tree.insertNode(5);
    tree.insertNode(1);
    tree.insertNode(15);
    tree.insertNode(30);

    System.out.println("head : " + tree.nodehead.value);
    System.out.println("head left : " + tree.nodehead.left.value);
    System.out.println("head left : " + tree.nodehead.left.left.value);
    System.out.println("head right : " + tree.nodehead.right.value);
    System.out.println("head right : " + tree.nodehead.right.right.value);
  }
}
