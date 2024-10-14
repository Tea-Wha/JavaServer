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
            // 상대 경로로 파일 가져오기
            fileInputStream = new FileInputStream("src/자바파이널과제/Student.txt");
        }
        catch (FileNotFoundException e){
            System.out.println("파일을 찾지 못했습니다.");
        }
        // 스캐너 객체를 생성하는데 입력을 파일에서 읽어들임
        TreeSet<Student> students = new TreeSet<>();
        Scanner scanner = new Scanner(fileInputStream);
        // List<Student> list = new ArrayList<>();
        // 10명의 데이터를 파일에서 읽어들여 객체로 만들어서 리스트에 저장
        // 리스트 -> 중복 제거 안되고, 정렬을 위해서 sort() 메소드를 불러줘야 함, 입력 순서대로 저장됨
        while (scanner.hasNextLine()) { // 읽어들일 라인이 있으면 true
            String line = scanner.nextLine(); // 라인별로 저장 -> 한 타임에 한 라인씩 저장됨(텍스트 문자열)
            String[] data = line.split(" "); // 배열에 공백 기준으로 데이터 저장
//            System.out.println(Arrays.toString(data));
            // 생성자를 통해서 Student 객체를 리스트에 추가
            // 생성자의 매개변수로 전달되는 내용은 파일에서 읽어들인 각 라인의 정보
            // 국어, 영어, 수학 성적은 연산이 필요하므로 -> 정수로 형변환 (Integer.parseInt)
            students.add(new Student((String)data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3])));
        }
        // 리스트를 정렬할 때 사용하는 메소드
        // 리스트의 객체를 정렬하는 경우 Comparable 을 상속받아 compareTo 구현 해줘야 함
        // Collections.sort(list);
        // 향상된 for 문으로 리스트를 순회하면서 요소를 출력
        // 해당 요소의 객체가 toString() 을 오버라이딩 하는 경우 메소드 접근 없이 toString() 내용 출력
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
        // 결과가 양수이면 정렬 조건이 됨 (자리 변환) -> compareTo 메소드는 String 에 사용 (문자열 비교 메소드)
        if (this.tot == o.tot) return this.name.compareTo(o.name);
        // 같지 않은 경우 -> 성적 오름차순
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