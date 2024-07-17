package dataIO.object;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product implements Serializable {
  private static final long serialVersionUID = 2L;
  private String pId;
  private String pName;

}
