package 스트림2;

// Stream -> 람다식으로 요소 처리 코드를 제공하고 내부 반복자를 사용하므로 병렬 처리가 쉽다는 장점을 가짐
// 중간 처리 -> 매핑, 필터링, 정렬 / 최종 처리 -> 반복, 카운팅, 평균, 총합 (집계 처리)
//

import java.util.ArrayList;
import java.util.List;

public class StreamEx2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("안유진",99));
        list.add(new Student("장원영", 88));
        list.forEach(s ->{ // forEach -> 내부 반복자를 통해서 순회
            System.out.println(s.getName()+" : "+s.getScore());
        });
    }
}

class Student{
    private String name;
    private int score;
    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
}