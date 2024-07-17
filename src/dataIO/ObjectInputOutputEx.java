package dataIO;

import dataIO.object.Member;
import dataIO.object.Product;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ObjectInputOutputEx {

  public static void main(String[] args) throws IOException, ClassNotFoundException {

    //fos에 oos 보조 스트림 연결
    FileOutputStream fos = new FileOutputStream("C:/Temp/object.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);

    //객체 생성
    Member member = new Member("ssg001", "김세계");
    Product product = new Product("001", "선풍기");
    int[] ints = {10,20,30};
    String greeting = "Hello";

    //객체를 역직렬화 해서 파일에 저장하기
    oos.writeObject(member);
    oos.writeObject(product);
    oos.writeObject(ints);
    oos.writeObject(greeting);

    oos.flush();
    oos.close();
    fos.close();

    //FileInputStream 에 보조스트림 ObjectInputStream 연결
    FileInputStream fis = new FileInputStream("C:/Temp/object.txt");
    ObjectInputStream ois = new ObjectInputStream(fis);

    //파일을 읽어오면서 역직렬화하여 객체로 복원함
    Member member1 = (Member) ois.readObject();
    Product p1 = (Product) ois.readObject();
    int[] ints1 = (int[]) ois.readObject();
    String g1 = (String) ois.readObject();

    ois.close();
    fis.close();

    System.out.println(member1);
    System.out.println(p1);
    System.out.println(Arrays.toString(ints));
    System.out.println(g1);
  }
}
