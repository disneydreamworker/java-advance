package generic.classEx;

public class GenericEx01 {

  public static void main(String[] args) {
    Box<String> box = new Box<String>();
    box.content = "러브레터";
    String content = box.content;

    Box<Integer> box1 = new Box<Integer>();
    box1.content = 100;
    int content1 = box1.content;

    Box<Doll> box2 = new Box<Doll>();
    box2.content = new Doll();
    Doll content2 = box2.content;
    System.out.println(content2.name);

    Product<SmartPhone,String> p1 = new Product<SmartPhone, String>();
    p1.setKind(new SmartPhone());
    p1.setModel("애플15Pro");

    SmartPhone applePhone = p1.getKind();
    String model = p1.getModel();
    System.out.println(applePhone + " " + model);



  }

}
