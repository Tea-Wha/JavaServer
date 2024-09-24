package 시스템입출력;
import java.util.Scanner;
// 리다이렉션이란 컴퓨터 프로그램이나 운영 체제에서 입력과 출력을 다른 곳으로 보내는 기능
// 다른 언어들은 함수가 클래스 외부에 있어도 되지만/ 자바는 모든 함수가 클래스 내부에 있어야만 함
// 자바 표준 입출력 클래스 : 
// System.in(표준 입력): 프로그램 내에서 사용자의 입력을 받음 (콘솔 입력)
// System.out(표준 출력): 프로그램 내의 결과를 콘솔에 출력 (리다이렉션 가능)
// print(메서드 오버로딩), println(메서드 오버로딩), printf(서식 지정자)
// System.err(표준 오류 출력): 오류를 출력하기 위해서 사용 (리다이렉션 불가), 대체제가 있음(Sl4f)
// 서식지정자 : %d(decimal), %ld(long decimal), %f(float), %.2f, %5d(5칸의 공간 생성/오른쪽 정렬)
// %-5d(5칸 공간 생성/왼쪽 정렬), %s(string)(문자열), %c(character)(문자), %%(%기호를 출력)
// 이스케이프시퀀스 : \n (new line)(줄 바꿈), \r (커서를 맨앞으로 이동), \t (탭), \b (백), \\(백슬래쉬)
public class SystemInOutEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //System.in -> 콘솔 입력 받음

        String name = "Hong";
        String addr = "Seoul City";
        char gender = 'M';
        int age = 29;
        int kor = 89;
        int eng = 95;
        int mat = 100;
        double aver = 0.0;

        //자바 스타일 (print 오버로딩) (println)
        System.out.println("====== Java Style Output ======");
        System.out.println("Name : " + name);
        System.out.println("Address : " + addr);
        System.out.println("Gender : " + gender);
        System.out.println("Age : " + age);
        System.out.println("Total : " + (kor+eng+mat));
        // 명시적 형변환과 묵시적 형변환이 일어남 -> 앞이 double 형으로 바껴서 -> 뒤의 3이 3.0으로 변화
        System.out.println("Average : " + (double)(kor+eng+mat)/3);
        System.out.println(String.format("평균 : %.2f", (double)(kor+eng+mat)/3));
        
        //C언어 스타일 (printf 서식지정자)
        System.out.println("====== C Style Output ======");
        System.out.printf("Name : %s\n", name);
        System.out.printf("Address : %s\n", addr);
        System.out.printf("Gender : %c\n", gender);
        System.out.printf("Age : %d\n", age);
        System.out.printf("Total : %d\n", (kor+eng+mat));
        System.out.printf("Average : %.2f\n", (double)(kor+eng+mat)/3);
        
        // System 클래스의 모든 필드와 메소드는 정적 필드와 정적 메소드로 구성
        // 대문자는 전부 정적 / 소문자 -> 개체
    }
}
