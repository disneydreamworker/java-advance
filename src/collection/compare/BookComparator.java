package collection.compare;

import java.util.Comparator;

public class BookComparator implements Comparator<Book2> {

  @Override
  public int compare(Book2 o1, Book2 o2) {
    //출판년도 내림차순, 제목 글자수로 내림차순, 제목 내림차순
    int result = (o1.getYear() - o2.getYear()) * (-1);
    if (result == 0) {
      result = (o1.getTitle().length() - o2.getTitle().length()) * (-1);
    }
    if (result == 0) {
      result = (o1.getTitle().compareTo(o2.getTitle())) * (-1);
    }
    return result;
  }

//  @Override
//  public int compare(Book2 o1, Book2 o2) {
//    //출판년도 기준 내림 차순 정렬
//    if (o1.getYear() == o2.getYear()) return 0;
//    else if (o1.getYear() < o2.getYear()) return 1;
//    else return -1;
//  }

//  @Override
//  public int compare(Book2 o1, Book2 o2) {
//    //내림차순 정렬
//    int result = (o1.getTitle().compareTo(o2.getTitle())) * -1;
//    return result;
//  }


}
