package collection.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookComparartorEx {

  public static void main(String[] args) {
    List<Book2> bookshelf = new ArrayList<>();
    bookshelf.add(new Book2("세이노의 가르침", "세이토", "화이트혁명", 2024));
    bookshelf.add(new Book2("호모데우스", "유발 하라리", "민음사", 2023));
    bookshelf.add(new Book2("불안", "알랭 드 보통", "은행나무", 2022));
    bookshelf.add(new Book2("코스모스", "칼세이건", "사이언스북", 2021));
    bookshelf.add(new Book2("동물농장", "조지오웰", "민음사", 2020));
    bookshelf.add(new Book2("정의란 무엇인가", "마이클샌델", "와이즈베리", 2019));
    bookshelf.add(new Book2("사피엔스", "유발 하라리", "김영사", 2018));
    bookshelf.add(new Book2("역사의 쓸모", "최태성", "다산북스", 2017));

    Comparator<Book2> comparator = new Comparator<Book2>(){
      @Override
      public int compare(Book2 o1, Book2 o2) {
        return (o1.getYear() - o2.getYear());
      }
    };

    Collections.sort(bookshelf, new BookComparator());

    for (Book2 book2 : bookshelf) {
      System.out.println(book2.getTitle() + " " + book2.getWriter() + "  " + book2.getYear());
    }

    System.out.println("-----------------");

    Collections.sort(bookshelf, comparator);

    for (Book2 book2 : bookshelf) {
      System.out.println(book2.getTitle() + " " + book2.getWriter() + "  " + book2.getYear());
    }
  }
}
