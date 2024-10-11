package 자바파이널과제;
// - 임의의 위치에 텍스트 파일을 만들고, 10명의 정보를 공백 기준으로 미리 입력 해둠
// - 이름 국어 영어 수학 형식

// 해당 파일을 읽어 총점을 구하고 총점이 높은 사람 순으로 이름과 총점 보여주기 (총점이 같은 경우 이름순)
// split 기준 -> 공백 자름


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class JavaFinalReportMain {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try{
            fileInputStream = new FileInputStream("src/자바파이널과제/Student.txt");
        }
        catch (FileNotFoundException e){
            System.out.println("파일을 찾지 못했습니다.");
        }
        TreeSet<Student> students = new TreeSet<>();
        Scanner scanner = new Scanner(fileInputStream);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine(); // 라인별로 저장
            String[] data = line.split(" "); // 배열에 공백 기준으로 데이터 저장
//            System.out.println(Arrays.toString(data));
            students.add(new Student((String)data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3])));
        }
        for (Student e : students){
            System.out.println(e+" 점수 : "+e.getTot());
        }
    }
}

class Student implements Comparable<Student>{
    String name;
    int kor;
    int eng;
    int mat;
    int tot;

    @Override
    public int compareTo(Student o) {
        getTot();
        if (this.tot == o.tot) return this.name.compareTo(o.name);
        else return o.tot-this.tot;
    }

    public Student(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public String getName() {
        return name;
    }

    public int getTot() {
        tot = kor + eng + mat;
        return tot;
    }

    public String toString(){
        return getName();
    }
}