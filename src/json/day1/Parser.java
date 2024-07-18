package json.day1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
import org.json.JSONObject;

public class Parser {

  //json parsing : 내보낸 json 파일로부터 다시 객체를 복원해오는 것
  public static void main(String[] args) throws IOException {
    //파일로부터 json 읽어오기
    BufferedReader br = new BufferedReader(new FileReader("C:/Temp/employee.json", StandardCharsets.UTF_8));
    String json = br.readLine();
    br.close();

    //제이슨 객체 만들기
    JSONObject rootParsing = new JSONObject(json);


    //Getter, Setter 기본 제공
    System.out.println(rootParsing.get("phone"));
    System.out.println(rootParsing.get("id"));


    //객체 속성 정보 읽기
    JSONObject phone = new JSONObject(rootParsing.getJSONObject("phone"));
    JSONObject phone2 = rootParsing.getJSONObject("phone");


    System.out.println(phone.keys());
    System.out.println(phone2.toString());


    //객체 속성 배열 읽기
    JSONArray skill = rootParsing.getJSONArray("skill");


    System.out.println("skill :  ");
    for (int i =0;i<skill.length();i++){
      System.out.println(skill.get(i) + " ,");
    }
  }
}
