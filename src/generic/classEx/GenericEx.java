package generic.classEx;

public class GenericEx {

  public static void main(String[] args) {
    //Box의 content가 Object 타입일 때
//    Box box = new Box();
//    box.content = new Gift(); //content에 담긴 Gift는 자동 업캐스틍 됨
    //자동으로 다운캐스팅하여 출력함 (매번 다운캐스팅 하기 때문에 자원 낭비)
//    System.out.println(box.content.toString()); //generic.classEx.Gift@58372a00
//    System.out.println((Gift)box.content); //generic.classEx.Gift@58372a00

    //제너릭 추가
    //public T content;
    //Gift만 담을 수 있게 됨
    //인스턴스할때 어떤 타입을 담을지 결정됨
    //해당 타입만 담을 수 있음
    Box<Gift> box = new Box<>();
    box.content = new Gift();
    //String형 담기 불가
//    box.content = "선물"; <- 오류!

    //파라미터 타입을 여러개 받기
    //박싱
    Product<SmartPhone, String> product1 = new Product<>();
    product1.setKind(new SmartPhone());
    product1.setModel("ApplePro");
    //언박싱
    SmartPhone apple = product1.getKind();
    String model = product1.getModel();
    System.out.println(apple + " " + model); //generic.classEx.SmartPhone@2f4d3709 ApplePro

    //박싱
    Product<Car, String> product2 = new Product<>();
    product2.setKind(new Car());
    product2.setModel("벤틀리");
    //언박싱
    Car car = product2.getKind();
    String carModel = product2.getModel();
    System.out.println(car + " " + carModel); //generic.classEx.Car@1d81eb93 벤틀리

  }
}
