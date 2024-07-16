package lambda.day3;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Member {

  private String id;
  private String name;

  public Member(String s) {
    this.id = s;
  }
}


