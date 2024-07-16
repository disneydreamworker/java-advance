package lambda.day3;

import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
public interface BufferedReaderProcessor {
    //String을 리턴하는 메서드
    //java.io의 BufferedReader를 처리
    //exception 처리 필수
    String process(BufferedReader br) throws IOException;
}
