package 스트림2;

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