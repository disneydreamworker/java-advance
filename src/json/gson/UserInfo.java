package json.gson;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class UserInfo {

   private  String No;
   private  String name;
   private List<String> roles;

}
