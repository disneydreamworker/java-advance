package gson.assignment;

import static gson.assignment.UtilJson.jsonToString;
import static gson.assignment.UtilJson.parseJsonData;
import static gson.assignment.UtilJson.parseJsonDataUseIterator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

public class CreateJsonApp {
  private static Gson gson = new GsonBuilder()
      .disableHtmlEscaping() //HTML 문자를 유니코드로 이스케이프 처리할게. HTML 문자를 그대로 전달할게.
      .setPrettyPrinting() //Json 문자열을 가독성 좋게 출력할게.
      .serializeNulls() //null인 필드를 스킵하지만, 이 옵션을 사용하면 null로 인해 필드가 누락된 경우 발생하는 예외상황을 방지한다
      .create();


  public static void main(String[] args) throws IOException {
    JSONObject jsonObject = UtilJson.createJsonData();
    String writingJson = gson.toJson(jsonObject);
    System.out.println(jsonObject);


    BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Temp/product_info.json", StandardCharsets.UTF_8));
    bw.write(writingJson);
    bw.flush();
    bw.close();



    BufferedReader br = new BufferedReader(new FileReader("C:/Temp/product_info.json", StandardCharsets.UTF_8));
    parseJsonData(jsonObject);
    br.close();


    parseJsonDataUseIterator(jsonObject);
  }

}