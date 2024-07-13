package collection.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

//https://www.acmicpc.net/problem/1181
//알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
//길이가 짧은 것부터
//길이가 같으면 사전 순으로
//단, 중복된 단어는 하나만 남기고 제거해야 한다.
public class Homework {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int wordsCnt = sc.nextInt();
    sc.nextLine();

    TreeSet<String> treeSet = new TreeSet<>();

    while (sc.hasNext()) {
      treeSet.add(sc.nextLine());
    }

    List<String> list = new ArrayList<>(treeSet);

    Collections.sort(list, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        if (o1.length() == o2.length()) {
          return o1.compareTo(o2);
        }
        return o1.length() - o2.length();
      }
    });

    for (String word : list) {
      System.out.println(word);
    }
  }
}
