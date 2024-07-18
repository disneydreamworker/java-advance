package gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CreateGson {

  public static void main(String[] args) {
    //객체 생성 1
    Gson gson1 = new Gson();

    //객체 생성 2
    Gson gsn2 = new GsonBuilder().create();

    //오브젝트 생성 3
    Gson gson3 = new GsonBuilder().setPrettyPrinting().create();



  }
}
