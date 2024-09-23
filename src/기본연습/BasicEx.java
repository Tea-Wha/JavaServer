package 기본연습;
/*
    Date : 2024.09.23
    Author : 홍태화
    Purpose : 기본 샘플 프로그램
 */

/* 클래스 블록 */
public class BasicEx {
    // public은 접근 제한자, static은 정적메소드, void는 반환값이 없음을 의미
    // main은 프로그램의 시작 지점, String[] args 프로그램 실행 시 인자값을 받기 위한 부분
    /* 메소드 블록 */
    public static void main(String[] args) {
        System.out.println("안녕하세요, 자바를 시작 합니다.");
        System.out.print(7); // print() 메소드는 줄 바꿈을 하지 않음.
        System.out.println(3);
        System.out.printf("%d\n",3);
        System.out.printf("%d ",3);
        System.out.printf("%d\n",7); // 서식 지정자 사용
        System.out.print("문자열을 이어서 " + "출력하기\n");
        System.out.println("성적 : "+98+" 점 입니다.");
        System.out.println("성적 : "+98+100); //문자열이 먼저 나왔기 때문에 98100이 됨
        System.out.println(100+200+" 점수"); //정수열이 먼저 나왔기 때문에 300이 됨
        System.out.printf("%d\n", 300); // \n -> 줄 바꿈
        System.out.printf("%s\n", "경기도 수원시");
        char gender = 'M'; // 자바는 문자와 문자열은 다르다 // String -> " "과 Char -> ' '
        System.out.printf("%c\n", gender); // 문자열과 문자가 구분이 됨?
        System.out.printf("%c\n", 68);
        System.out.printf("%.2f\n", 3.141592);

        char test = 'A';
        System.out.printf("%d\n", (int)test);

// print(), println() -> 메소드 오버로딩으로 구현되어 있음
    }
}
