package gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONObject;

public class ObjectToJson {

  //Gson 객체 생성
  private static Gson gson = new GsonBuilder()
      .disableHtmlEscaping()
      .setPrettyPrinting()
      .serializeNulls().create();


  //Student 객체 생성 후 리턴
  public static Student getData(){
    Student stu = new Student(1, "나");
    return stu;
  }


  public static void main(String[] args) {
    //1. student 객체를 만들고 그 객체를 파라미터로 Gson 객체를 만든다
    String jsonStudent = gson.toJson(getData());

    System.out.println(jsonStudent);

    Student parsingStudent = gson.fromJson(jsonStudent, Student.class);

    System.out.println(parsingStudent.toString());
  }
}
