package collection.tree;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {

  public static void main(String[] args) {

    //랜덤한 학생 점수를 TreeSet 구조에 저장 관리
    TreeSet<Integer> treescores = new TreeSet<>();

    //학생 점수를 저장
    //저장과 동시에 정렬
    treescores.add(80);
    treescores.add(90);
    treescores.add(100);
    treescores.add(75);
    treescores.add(82);
    treescores.add(69);
    treescores.add(94);

    //점수 가져오기
    for (Integer score : treescores) {
      System.out.print(score + " ");
    }
    System.out.println();

    //점수 한 개 가져오기
//    System.out.println("최저 점수 : " + treescores.first());
//    System.out.println("최고 점수 : " + treescores.last());
//    System.out.println("90점 아래 점수 : " + treescores.lower(90));
//    System.out.println("90점 위 점수 : " + treescores.higher(90));
//    System.out.println("90점 또는 아래 점수 : " + treescores.floor(90));
//    System.out.println("90점 또는 위 점수 : " + treescores.ceiling(90));
    //69 75 80 82 90 94 100
    //최저 점수 : 69
    //최고 점수 : 100
    //90점 아래 점수 : 82
    //90점 위 점수 : 94
    //90점 또는 아래 점수 : 90
    //90점 또는 위 점수 : 90

    //내림차순 정렬
    NavigableSet<Integer> descScores = treescores.descendingSet();

    for (Integer score : descScores) {
      System.out.print(score + " ");
    }
    System.out.println();


    //***범위 검색을 통해 더 빠른 탐색 가능***
    NavigableSet<Integer> rangeScores = treescores.tailSet(90, true);

    for (Integer score : rangeScores) {
      System.out.print(score + " ");
    }
    System.out.println();


    //***구간 검색 (두 숫자 사이의 구간 탐색)***
    NavigableSet<Integer> subScores = treescores.subSet(90, true, 95, false);

    for (Integer score : subScores) {
      System.out.print(score + " ");
    }
    System.out.println();
  }
}

