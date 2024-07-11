package tree.treemap;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

  public static void main(String[] args) {
    TreeMap<String, Integer> treemap = new TreeMap<>();

    //엔트리 저장
    treemap.put("권용빈", 90);
    treemap.put("서유미", 80);
    treemap.put("김은강", 95);
    treemap.put("고재현", 70);
    treemap.put("이경진", 83);
    treemap.put("이지은", 93);

    //정렬된 엔트리 하나씩 가져오기
    Set<Entry<String, Integer>> entrySet = treemap.entrySet();
    for (Entry<String, Integer> student : entrySet) {
      System.out.println(student.getKey() + " ---" + student.getValue());

    }
    System.out.println("=====================");
    //특정 키 검색하여 값 가져오기
    Entry<String, Integer> entry = null;
    entry = treemap.firstEntry();
    System.out.println(entry.getKey() + "------" + entry.getValue());

    entry = treemap.lastEntry();
    System.out.println(entry.getKey() + "------" + entry.getValue());

    entry = treemap.lowerEntry("이지은");
    System.out.println(entry.getKey() + "------" + entry.getValue());

    //desc (내림차순) 정렬
    System.out.println("=============(내림차순) 정렬============");
    NavigableMap<String, Integer> descStudents = treemap.descendingMap();
    Set<Entry<String,Integer>> descScoresSet = descStudents.entrySet();

    for (Entry<String,Integer> student : descScoresSet) {
      System.out.print(student.getKey()+ "---" + student.getValue());
    }


    System.out.println("\n");
    System.out.println("============범위 검색 가능함==============");

    //범위 검색 가능함
    NavigableMap<String,Integer> substudent = treemap.subMap("김" ,true,"이",false);
    for (
        Entry<String,Integer> submap : substudent.entrySet()) {
         System.out.print(submap.getKey() + "---"+ submap.getValue());
    }
    System.out.println("\n");



  }


}
