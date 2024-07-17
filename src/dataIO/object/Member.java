package dataIO.object;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Member implements Serializable {
  private String id;
  private String name;

}
