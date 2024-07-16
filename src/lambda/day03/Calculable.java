package lambda.day03;

//SAM : void calculate(int x, int y)
@FunctionalInterface
public interface Calculable {
  int calculate(int x, int y);
}
