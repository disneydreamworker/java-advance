package collection.compare;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//Book VO
@Getter
@Setter
@AllArgsConstructor
public class Book implements Comparable<Book> {

  private String title;
  private String writer;
  private String publisher;
  private int year;

  @Override
  public int compareTo(Book o) {
    int result = this.getTitle().compareTo(o.getTitle());
    if (result == 0) {
      result = this.getYear() - o.getYear();
    }
    return result;
  }

//  @Override
//  public int compareTo(Book o) {
//    if (this.year == o.year) return 0;
//    else if (this.year < o.year) return -1; //오름차순
//    else return 1;
//  }

//  @Override
//  public int compareTo(Book o) {
//    int result = this.getTitle().compareTo(o.getTitle());
//    return result;
//  }

}
