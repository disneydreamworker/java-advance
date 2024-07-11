package collection.map;

import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {

  //Properties는 HashTable의 자식 클래스로, Map의 구조로 K/V로 구성되어 있다
  public static void main(String[] args) throws IOException {
    Properties properties = new Properties();
    //PropertiesEx 클래스를 기준으로 ddatabase.properties 파일을 읽어온다
    //class 객체의 getResourceAsStream 메서드는 주어진 상대 경로의 리소스 파일을 읽어와서 InputStream을 리턴한다
    properties.load(PropertiesEx.class.getResourceAsStream("database.properties"));
    String driver = properties.getProperty("driver");
    String url = properties.getProperty("url");
    String username = properties.getProperty("username");
    String password = properties.getProperty("password");
    System.out.printf("%s %s %s %s", driver,url,username,password);
  }
}
