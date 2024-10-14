package 스트림중개연산;
// 스트림 중개 연산 : 생성된 스트림을 중개연산 또는 다른 스트림으로 변환
// 필터링 : filter(), distinct()
// 변환 : map(), flatMap()
// 제한 : limit(), skip()
// 정렬 : sorted()

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMidEx {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.of(7,5,5,3,2,1,6,4,8);
        IntStream stream2 = IntStream.of(7,5,5,3,2,1,6,4,8);
        // 중복 제거 이후 결과 출력
        stream1.distinct().forEach(e-> System.out.print(e+" ")); // 최종 연산이 되고 나면 -> 사라짐(소멸)
        System.out.println();
        // 필터링 이후 결과 출력
        stream2.filter(e->e%2!=0).forEach(e-> System.out.print(e+ " "));
        // 스트림 변환 : map(), flatMap()
        System.out.println();
        Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "REACT");
        stream.map(e->e.length()).forEach(e-> System.out.print(e+ " "));

        System.out.println();
        String[] arr = {"I study hard", "You study JAVA", "I am hungry"};
        Stream<String> stream3 = Arrays.stream(arr);
        stream3.flatMap(s->Stream.of(s.split(" "))).forEach(s-> System.out.print(s+"/"));

        // 중개 연산 : 제한
        IntStream stream4 = IntStream.range(0,10); // 0 ~ 10 미만
        IntStream stream5 = IntStream.range(0,10);
        IntStream stream6 = IntStream.range(0,10);
        
        // skip() : 전달된 개수만큼의 요소를 제외하고 새로운 스트림 반환
        System.out.println();
        stream4.skip(4).forEach(e-> System.out.print(e+ " "));
        System.out.println();

        // limit() : 전달된 개수만큼의 요소로 이루어진 새로운 스트림 반환
        stream5.limit(5).forEach(e-> System.out.print(e+ " "));
        System.out.println();

        // sorted() : comparator 를 이용해 정렬
        Stream<String> stream7 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
        Stream<String> stream8 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
        Stream<String> stream9 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
        // 오름차순
        stream7.sorted().forEach(e-> System.out.print(e + " "));
        System.out.println();
        // 내림차순
        stream8.sorted(Comparator.reverseOrder()).forEach(e-> System.out.print(e + " "));
        System.out.println();
        
        // 길이 기준으로 정렬하고, 길이가 같으면 알파벳 정렬
        stream9.sorted(Comparator
                .comparingInt(String::length) // 오버라이딩은 불가능
                .thenComparing(String::compareTo)) // 내부에 있는 메소드 사용
                .forEach(e-> System.out.print(e+" "));

    }

}

