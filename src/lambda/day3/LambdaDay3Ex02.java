package lambda.day3;

@FunctionalInterface
interface Operator {

  int apply(int x, int y);
}

public class LambdaDay3Ex02 {

  private static final int[] scores = {90, 80, 60};

  public static int maxOrMin(Operator operator) {
    int result = scores[0];
    // scores에서 최대값 또는 최소값을 찾아 리턴하는 코드를 작성하세요
    for (int i = 1; i < scores.length; i++) {
      result = operator.apply(scores[i], result);
    }

    //  for (int score : scores) {
    //            result = operator.apply(result, score);
    //        }

    return result;
  }


  public static void main(String[] args) {

    int max = maxOrMin((x,y)-> Math.max(x, y));  //최대값 얻기 람다식 작성
    int min = maxOrMin((x,y) -> x > y ? y : x);  //최소값 얻기 람다식 작성

    System.out.println(max);
    System.out.println(min);

  }
}


/*
@FunctionalInterface
interface Operator{
  public int apply (int x, int[] y);
}

public class Example02 {
  private static int[] scores ={90,80,60};
  public static int maxOrMin(Operator operator){
    int start = scores[0];
    // scores에서 최대값 또는 최소값을 찾아 리턴하는 코드를 작성하세요
    return operator.apply(start, scores);
  }

  public static void main(String[] args) {
    int max = maxOrMin((x, y)->{
      int temp = x;
      for(int n:y){
        if(n>temp)
          temp = n;
      }
      return temp;
    });
    //최대값 얻기 람다식 작성
    int min = maxOrMin(((x, y) -> {
      int temp = x;
      for(int n:y){
        if(n<temp)
          temp = n;
      }
      return temp;
    }));
    //최소값 얻기 람다식 작성
    System.out.println(max);
    System.out.println(min);
  }
}*/