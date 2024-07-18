package json.day1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJasnEx {

  //json 객체 생성하기
  public static void main(String[] args) throws IOException {
    JSONObject root = new JSONObject();

    root.put("id","ssg001");
    root.put("name","신세계");
    root.put("dept","IT-Develop");
    root.put("job", "developer");


    JSONObject phone = new JSONObject();
    phone.put("home", "02-1212-3434");
    phone.put("handphone", "010-5656-7878");
    phone.put("handphone2", "010-7878-9090");

    root.put("phone", phone);

    //배열 객체 속성 추가
    JSONArray skill = new JSONArray();
    skill.put("Java");
    skill.put("C, C#");
    skill.put("Python");
    skill.put("JSP&Servlet");
    skill.put("Spring");
    //배열은 주소값만 저장 가능 Object 불가능
    //skill.put("id", "ssg111");
    root.put("skill", skill);

    String jsonValue = root.toString();
    System.out.println(jsonValue);



    //log 파일 저장
    Writer jsonWriter = new FileWriter("C:/Temp/employee.json", Charset.forName("UTF-8"));
    jsonWriter.write(jsonValue);
    jsonWriter.flush();
    jsonWriter.close();


  }
}
