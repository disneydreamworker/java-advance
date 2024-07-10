package collection.collectionEx.board;

import java.util.ArrayList;
import java.util.List;

public class BoardEx {

  public static void main(String[] args) {
    //List 인터페이스로 업캐스팅해서 사용해서 다른 List 클래스로 재활용 가능
    List<Board> boardList = new ArrayList<>();

    boardList.add(new Board("제목이예요", "나", "안녕하세요."));
    boardList.add(new Board("제목이예요", "나", "안녕하세요."));
    boardList.add(new Board("제목이예요", "나", "안녕하세요."));
    boardList.add(new Board("제목이예요", "나", "안녕하세요."));
    boardList.add(new Board("제목이예요", "나", "안녕하세요."));

    int boardsize = boardList.size();
    System.out.println(boardsize);

    //특정 인덱스로 객체 가져오기
    Board board = boardList.get(2);
    System.out.println(board);

    //boardList에 담겨있는 모든 Board를 출력하기
    //1. 인덱스 이용
    for (int i = 0; i < boardList.size(); i++) {
      Board boards = boardList.get(i);
      System.out.println(boards);
    }
    System.out.println("--------------------------");
    //2.enhanced for 사용
    for (Board boards : boardList) {
      System.out.println(
          boards.getSubject() + "\t" + board.getWriter() + "\t" + boards.getContent());
    }
  }
}
