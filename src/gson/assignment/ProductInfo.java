package gson.assignment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductInfo {

  private int product_no;
  private String product_name;
  ExtraProductInfo extraProductInfo;
  ItemList itemList;

}
