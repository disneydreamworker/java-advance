package thread;

import collection.board.Board;
import java.util.ArrayList;
import java.util.List;

public class VectorEx {

  public static void main(String[] args) {
//    List<Board> list = new Vector<>();
    List<Board> list = new ArrayList<>();

    //작업 스레드 객체 생성
    Thread threadA = new Thread() {
      @Override
      public void run() {
        //Board를 10000개 추가
        for (int i = 1; i < 101; i++) {
          list.add(new Board("인사올립니다" + i, "유저" + i, "안녕" + i));
        }
        super.run();
      }
    };

    //스레드 2 번 생성
    Thread threadB = new Thread() {
      @Override
      public void run() {
        //Board를 10000개 추가
        for (int i = 100; i < 201; i++) {
          list.add(new Board("인사올립니다" + i, "유저" + i, "안녕" + i));
        }
        super.run();
      }
    };

    //Thread starts 작업 시작
    threadA.start();
    threadB.start();

    //main 스레드까지 총 3개의 스레드가 돌아가고 있음
    //join : 스레드 1,2 작업이 모두 종료될 때까지 main이 끝나지 않음
    //       -> 스레드가 모두 실행되었음을 확인할 수 있음
    try {
      threadA.join();
      threadB.join();
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println(list.size());
    //출력
    for (Board board : list) {
      System.out.println(board.getSubject());
    }
  }
}

//Vector로 실행 시 동기화를 제공하여 200건이 모두 안전하게 들어감 (충돌 X)
//스레드B가 A보다 먼저 실행됨 => 스케쥴러가 스케쥴링 기법에 의해서 cpu를 할당하여 아래처럼 입력됨
//인사올립니다100
//인사올립니다1
//인사올립니다101
//인사올립니다2
//인사올립니다102
//인사올립니다3
//인사올립니다4
//인사올립니다103
//인사올립니다5
//인사올립니다104
//인사올립니다6
//인사올립니다105
//인사올립니다7
//인사올립니다106
//인사올립니다8
//인사올립니다107
//인사올립니다9
//인사올립니다108
//인사올립니다10

//ArrayList로 실행 시 멀티스레드 환경에서 충돌이나서 190건만 들어감
//190
//인사올립니다100
//인사올립니다101
//인사올립니다102
//인사올립니다103
//인사올립니다104
//인사올립니다105
//인사올립니다106
//인사올립니다107
//인사올립니다108
//인사올립니다109
//인사올립니다110
//인사올립니다1
//인사올립니다111
//인사올립니다112
//인사올립니다2
//인사올립니다113
//인사올립니다3
//인사올립니다115
//인사올립니다4
//인사올립니다116
//인사올립니다5
//인사올립니다117
//인사올립니다118
//인사올립니다6