package gson.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class UtilJson {


  public static JSONObject createJsonData() {
    /**
     * 모든 데이터를 담을 JSONObject 생성
     */

    JSONObject productInfo = new JSONObject(); //상품정보를 담을 Json 형태의 객체

    /**
     * value로 단순 값(string, int)를 가지는 프로퍼티 처리.
     * product_no
     * product_name
     */

    productInfo.put("product_no", 1);
    productInfo.put("product_name", "UNIQLO Airism");

    /** 특정한 브랜드나 라벨이 붙어 있음
     * value로 Json을 가지는 프로퍼티 처리.
     * extra_product_info JSONObject 생성
     */

    JSONObject extra_product_info = new JSONObject();
    extra_product_info.put("made in", "CHINA"); //메이드 인
    extra_product_info.put("company", "UNIQLO"); //회사

    productInfo.put("extra_product_info", extra_product_info);

    /**
     * value로 Array를 가지는 프로퍼티 처리.
     * item_list JSONArray 생성
     */

    JSONArray item_list_array = new JSONArray();
    item_list_array.put("shirts");
    item_list_array.put("pants");
    item_list_array.put("jackets");
    item_list_array.put("pillow");

    /**
     * value로 Json을 가지는 프로퍼티 처리.
     * item_list.* JSONObject 생성하세요
     */


    JSONObject item_list= new JSONObject();
    item_list.put("item_list_array", item_list_array);
    productInfo.put("item_list", item_list);

    return productInfo;
  }


  public static void parseJsonData(JSONObject jsonObject) {

    /**
     * String 형태로 만들어져있는 JSON 데이터를 파싱해줄 객체 생성.
     */

    JSONObject jsonParsing;
    ProductInfo productInfo = new ProductInfo();

    /**
     * JSON 데이터가 String 형태로 들어왔음을 가정하기 위해
     * Json 데이터를 생성하고 String 형태로 바꿔주었다.
     */

    String parsing = jsonToString(jsonObject);

    jsonParsing = new JSONObject(parsing);

    /**
     * value로 단순 값(string, int)를 가지는 프로퍼티 조회.
     * product_no, product_name
     */

    ///
    System.out.println("<Product Info>");
    System.out.println("product_no : " + jsonParsing.get("product_no"));
    System.out.println("product_name : " + jsonParsing.get("product_name"));

    /**
     * value로 Json을 가지는 프로퍼티 조회.
     * extra_product_info를 꺼낼 때, JSONObject로 캐스팅.
     */

    JSONObject jsonExtraProductInfo = jsonParsing.getJSONObject("extra_product_info");
    System.out.println("<extra_product_info>");
    System.out.println("made in : " + jsonExtraProductInfo.get("made in"));
    System.out.println("company : " + jsonExtraProductInfo.get("company"));

    /**
     * value로 Array를 가지는 프로퍼티 조회.
     * item_list를 꺼낼 때, JSONArray로 캐스팅.
     */

    JSONObject jsonItemList = jsonParsing.getJSONObject("item_list");
    JSONArray jsonArray = jsonItemList.getJSONArray("item_list_array");

    System.out.println("<item_list>");

    for (int i = 0; i < jsonArray.length(); i++) {
      System.out.println((i+1) + " 번 : " + jsonArray.getString(i));
    }


    productInfo.setProduct_no(jsonParsing.getInt("product_no"));
    productInfo.setProduct_name(jsonParsing.getString("product_name"));
    productInfo.extraProductInfo = new ExtraProductInfo(jsonExtraProductInfo.getString("made in"), jsonExtraProductInfo.getString("company"));

    ArrayList<String> array = new ArrayList<>();
    for (int i =0; i< jsonArray.length();i++ ){
      array.add(jsonArray.getString(i));
    }

    productInfo.itemList = new ItemList(array);

    System.out.println("ProductInfo 클래스 출력하기");
    System.out.println(productInfo);

  }

  public static void parseJsonDataUseIterator(JSONObject jsonObject) {
    /**
     * String 형태로 만들어져있는 JSON 데이터를 파싱해줄 객체 생성.
     */


    JSONObject jsonParsing;
    ProductInfo productInfo = new ProductInfo();


    /**
     * JSON 데이터가 String 형태로 들어왔음을 가정하기 위해
     * Json 데이터를 생성하고 String 형태로 바꿔주었다.
     */

    String parsing = jsonToString(jsonObject);

    jsonParsing = new JSONObject(parsing);


    /**
     * value로 단순 값(string, int)를 가지는 프로퍼티 조회.
     * product_no, product_name
     */

    System.out.println("<Product Info Using Iterator>");
    Set<String> set = jsonParsing.keySet();

    for (String key : set) {
      System.out.println(key + " : " + jsonParsing.get(key).toString());
    }


    /**
     * value로 Json을 가지는 프로퍼티 조회.
     * extra_product_info를 꺼낼 때, JSONObject로 캐스팅.
     */


    JSONObject jsonExtraProductInfo = jsonParsing.getJSONObject("extra_product_info");
    System.out.println("<extra_product_info>");
    Set<String> set2 = jsonExtraProductInfo.keySet();
    for (String key : set2) {
      System.out.println(key + " : " + jsonExtraProductInfo.get(key).toString());
    }



    /**
     * value로 Array를 가지는 프로퍼티 조회.
     * item_list를 꺼낼 때, JSONArray로 캐스팅.
     */

    JSONObject jsonItemList = jsonParsing.getJSONObject("item_list");
    JSONArray jsonArray = jsonItemList.getJSONArray("item_list_array");

    System.out.println("<item_list>");
    for (int i = 0; i < jsonArray.length(); i++) {
      System.out.println((i+1) + " 번 : " + jsonArray.getString(i));
    }


    /**
     * item_list의 각 원소를 JSONObject로 캐스팅 후, 변수의 키셋을 가져온다.
     * [참고] 각 원소의 키가 다를 경우 유용하다.
     */

    JSONObject jsonObject1 = new JSONObject(jsonArray);
    Set<String> set3 = jsonObject1.keySet();
    System.out.println(Arrays.toString(set3.toArray()));
  }


  //json 객체를 String형으로 리턴하는 메서드
  public static String jsonToString(JSONObject jsonObject) {
    return jsonObject.toString();
  }
}
