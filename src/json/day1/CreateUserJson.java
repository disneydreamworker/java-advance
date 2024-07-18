package json.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import org.json.JSONArray;
import org.json.JSONObject;

public class CreateUserJson {

  public static void main(String[] args) throws IOException {
    JSONObject user = new JSONObject();
    user.put("name", "김세계");
    user.put("age", 20);
    user.put("isMarried", false);

    JSONArray hobbies = new JSONArray();
    hobbies.put("reading");
    hobbies.put("drawing");
    hobbies.put("dancing");


    user.put("hobbies", hobbies);


    JSONObject address = new JSONObject();
    address.put("home", "서울시 애구구");
    address.put("work", "서울시 브루클린동");


    user.put("address", address);


    //File write
    Writer writer = new FileWriter("C:/Temp/user.json");
    writer.write(user.toString());
    writer.flush();
    writer.close();



    //File Parsing
    BufferedReader br = new BufferedReader(new FileReader("C:/Temp/user.json"));


    JSONObject parseObject = new JSONObject(br.readLine());


    JSONObject parseAddress = parseObject.getJSONObject("address");


    JSONArray parseHobbies = parseObject.getJSONArray("hobbies");


    br.close();


    //출력하기
    System.out.println(parseHobbies);
    System.out.println(parseAddress);
    System.out.println(parseObject);

  }
}
