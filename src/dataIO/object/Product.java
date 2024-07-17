package dataIO.object;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product implements Serializable {
  private String pid;
  private String pName;

}
