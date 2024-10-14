package 스트림3;
// 스트림을 통한 병렬 처리
// 내부 반복자는 요소들의 반복순서를 변경하거나, 멀티코어 CPU를 최대한 활용하기 위해 요소들을 분배 시켜 병렬 처리를
// 할 수 있게 도와 줌
// 스트림 -> 임시

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("안유진", "장원영", "가을", "이서", "레이", "리즈");
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(StreamEx3::print);
        System.out.println();
    }
    static void print(String str){
        System.out.println(str+" : "+Thread.currentThread().getName());
    }
}
