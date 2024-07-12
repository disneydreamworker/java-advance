package collection.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEx {

  public static void main(String[] args) {
    List<Book> bookshelf = new ArrayList<>();
    bookshelf.add(new Book("세이노의 가르침", "세이토", "화이트혁명", 2024));
    bookshelf.add(new Book("호모데우스", "유발 하라리", "민음사", 2023));
    bookshelf.add(new Book("불안", "알랭 드 보통", "은행나무", 2022));
    bookshelf.add(new Book("코스모스", "칼세이건", "사이언스북", 2021));
    bookshelf.add(new Book("동물농장", "조지오웰", "민음사", 2020));
    bookshelf.add(new Book("정의란 무엇인가", "마이클샌델", "와이즈베리", 2019));
    bookshelf.add(new Book("사피엔스", "유발 하라리", "김영사", 2018));
    bookshelf.add(new Book("역사의 쓸모", "최태성", "다산북스", 2017));

    Collections.sort(bookshelf);

    for (Book book : bookshelf) {
      System.out.println(book.getTitle() + " " + book.getWriter() + " " + book.getPublisher() + " "
          + book.getYear());
    }

    //1.출판년도 기준으로 오름차순 정렬
    //2.책 제목 사전순으로 정렬
    //3.책 제목 기준으로 사전
    Collections.sort(bookshelf);
  }
}
