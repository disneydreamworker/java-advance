package collectionEx.board;

import java.util.ArrayList;
import java.util.List;

public class BoardEx {

  public static void main(String[] args) {
         List<Board> boardList = new ArrayList<Board>();   //Board 는 게시물 1개를 의미한다.
         // boardList는 여러개의 게시물을 저장하는 저장소

    boardList.add(new Board("배고파요 점심시간이 다가와요.","서유미" ,"강사가 안끝내줘요"));
    boardList.add(new Board("배고파요 점심시간이 다가와요.","서유미" ,"강사가 안끝내줘요"));
    boardList.add(new Board("배고파요 점심시간이 다가와요.","서유미" ,"강사가 안끝내줘요"));
    boardList.add(new Board("배고파요 점심시간이 다가와요.","서유미" ,"강사가 안끝내줘요"));
    boardList.add(new Board("배고파요 점심시간이 다가와요.","서유미" ,"강사가 안끝내줘요"));

    int boardsize = boardList.size();
    System.out.println(boardsize);
  }

}
