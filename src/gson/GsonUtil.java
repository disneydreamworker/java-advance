package gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class GsonUtil {
  private static Gson gson1 = new Gson();

  private static Gson gson2 = new GsonBuilder()
      .disableHtmlEscaping() //HTML 문자를 유니코드로 이스케이프 처리할게. HTML 문자를 그대로 전달할게.
      .setPrettyPrinting() //Json 문자열을 가독성 좋게 출력할게.
      .serializeNulls() //null인 필드를 스킵하지만, 이 옵션을 사용하면 null로 인해 필드가 누락된 경우 발생하는 예외상황을 방지한다
      .create();

  private static String getJsonData(){
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("data", "testData<Sinsege java backedrdeleping>");
    return gson2.toJson(jsonObject);
  }

  public static  UserInfo getData(){

      List<String> roles = new ArrayList<>();

      roles.add("Roll - 1");
      roles.add("Roll - 2");
      roles.add("Roll - 3");

//      UserInfo user = new UserInfo("1111", "ssg", roles);
      UserInfo user = new UserInfo(null, "ssg", roles);

      return user;
  }
  public static void main(String[] args) {

    System.out.println(getJsonData());
    System.out.println(gson2.toJson(getData()));

  }

}
