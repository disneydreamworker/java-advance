package collection.tree;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Set;

public class TreeMapEx {

  public static void main(String[] args) {
    TreeMap<String, Integer> treemap = new TreeMap<>();

    //ENTRY PUT
    treemap.put("플브", 700);
    treemap.put("플리", 1004);
    treemap.put("아스테룸", 312);
    treemap.put("카엘룸", 888);
    treemap.put("테라", 100);

    //정렬된 엔트리 가져오기 -> 키 값을 기준으로 오름차순
    Set<Entry<String, Integer>> entrySet = treemap.entrySet();

    for(Entry<String, Integer> entry : entrySet){
      System.out.println(entry.getKey() + " --- " + entry.getValue());
    }
    //아스테룸 --- 312
    //카엘룸 --- 888
    //테라 --- 100
    //플리 --- 1004
    //플브 --- 700

    System.out.println();

    //내림차순
    NavigableMap<String, Integer> entryMap = treemap.descendingMap();
    Set<Entry<String, Integer>> descEntrySet = entryMap.entrySet();
    for(Entry<String, Integer> entry : descEntrySet){
      System.out.println(entry.getKey() + " --- " + entry.getValue());
    }

    //특정 키 검색
    Entry<String, Integer> entry = null;
    System.out.println(treemap.firstEntry().getKey() + " " + treemap.firstEntry().getValue());
    System.out.println(treemap.lastEntry().getKey() + " " + treemap.lastEntry().getValue());
    System.out.println(treemap.lowerEntry("퍄퍄퍄").getKey() + " " + treemap.lowerEntry("퍄퍄퍄").getValue());

    //범위 검색
    NavigableMap<String, Integer> rangeEntry = treemap.subMap("가", true, "차", false);
    for (Entry<String, Integer> submap : rangeEntry.entrySet()){
      System.out.println(submap.getKey() + " " + submap.getValue());
    }
  }
}
