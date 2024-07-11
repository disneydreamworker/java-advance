package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();

    map.put(1, "남예준");
    map.put(2, "한노아");
    map.put(3, "채밤비");
    map.put(4, "도은호");
    map.put(5, "유하민");
    map.put(5, "칼리고"); //value 유하민이 칼리고로 바뀜

//    System.out.println(map.size());

//    //키를 이용해서 특정한 값을 가져오기
//    System.out.println(map.get(3)); //채밤비 출력
//
//    //키 셋 전체를 뽑아서 값을 가져오기
//    Set<Integer> keyset = map.keySet(); //key는 Set 타입으로 중복을 허용하지 않고 순서 구분 없이 저장됨
//    Iterator<Integer> iterator = keyset.iterator();
//
//    while(iterator.hasNext()){
//      Integer keyinteger = iterator.next();
//      System.out.print("키 셋 : ");
//      System.out.println(keyinteger);
//      System.out.print("키 셋의 value : ");
//      System.out.println(map.get(keyinteger));
//    }

    //엔트리
    for (Entry<Integer, String> entryset : map.entrySet()) {
      System.out.println(entryset);
    }
    //출력
    //1=남예준
    //2=한노아
    //3=채밤비
    //4=도은호
    //5=칼리고


    //엔트리 셋
    Set<Entry<Integer, String>> entrySet = map.entrySet(); //엔트리셋을 Set 클래스로 담는다. 엔트리 모두가 key가 되어서 중복 불가

  }
}
