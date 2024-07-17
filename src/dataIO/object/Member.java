package dataIO.object;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member implements Serializable {
  private static final long serialVersionUID = 1L;
  private String id;
  private String name;

}
