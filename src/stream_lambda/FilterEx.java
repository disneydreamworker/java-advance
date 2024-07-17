package stream_lambda;

import java.util.ArrayList;
import java.util.List;

public class FilterEx {

  public static void main(String[] args) {
    //
    List<String> list = new ArrayList<>();
    list.add("서유미");
    list.add("서유미");
    list.add("서유미");
    list.add("김유미");
    list.add("박유미");
    list.add("박유미");

    //중복요소를 제거해 주세요
    list.stream().distinct().forEach(yumis ->System.out.println(yumis));
    list.stream().distinct().forEach(System.out::println);
    System.out.println();
    list.stream().distinct().filter(yumis->yumis.startsWith("박"))
        .forEach(park-> System.out.println(park));


  }

}
