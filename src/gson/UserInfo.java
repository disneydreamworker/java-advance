package gson;


import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserInfo {

  private String no;
  private String name;
  private List<String> roles;
}
