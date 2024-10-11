package 예외처리;
// 오류 -> 컴파일 오류/실행 오류 // 예외처리 목적 -> 프로그램이 비정상 종료되는 것을 막기 위함
// Generic -> 컴파일 오류를 사전에 방지하기 위함 / 타입 제한
// 실행 오류 -> 시스템 오류(Error) -> 제어 불가능 / 예외(Exception) -> 제어 가능
// 예외처리를 하는게 좋을 수도 있고 나쁠 수도 있다.
// checked 예외 -> 컴파일러가 체크하는 예외 -> 입출력(IO) 관련 예외 / 데이터베이스 연결 예외 
// try-catch 블록이나 throws 절 사용 -> 당연한 구문 (가장 기본적임)
// unchecked 예외 -> 컴파일러가 체크하지 않는 예외 -> 런타임 에러 / 배열 인덱스 초과, 널 포인터 참조 등
// 예외 클래스 (클래스이다!)
// 자바 컴파일러는 소스 파일을 컴파일 할 때 일반 예외가 발생할 가능성이 있는 코드를 발견하면 컴파일 오류를 발생시켜
// 개발자로 하여금 강제적으로 예외 처리를 하도록 요구
// 실행 시 발생하는 예외는 개발자가 처리해야함
// * 컴파일 오류(문법을 잘못 작성하는 경우)
// * 실행중 오류(런타임 오류)
// 컴파일 타임의 오류와 런타임 오류의 경우에서 컴파일 타임에서 발생하는 것이 훨씬 바라짐(해결하기 유리함)
// 런타임에서 발생하는 오류를 컴파일 타임에서 잡기 위하여

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {
    public static void main(String[] args) {
//        arrayExceptionFunc();
//        fileNotFoundFunc();
//        nullPointerFunc();
        arithmeticFunc();
    }
    static void arrayExceptionFunc(){
        try {
            int[] arr = new int[5]; // 배열
            for (int i = 0; i <= 5; i++) {
                arr[i] = i;
                System.out.println(arr[i]); // -> ArrayIndexOutOfBoundsException
            }
        } catch (Exception e){ // Exception -> 예외 최상위 클래스
            System.out.println(e + "인덱스가 배열의 범위를 벗어났습니다."); // 다음과 같이 런타임 오류 클래스 특정 가능
        }
        System.out.println("프로그램 정상 종료");
    }
    static void fileNotFoundFunc() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e){
            System.out.println("해당 파일이 없습니다. 계혹 진행하시겠습니까?");
        }
    }
    // NullPointerException -> 참조하고 있는 객체가 없는 경우
    static void nullPointerFunc(){
        Test test = null; // 참조하는 객체가 없음을 의미
        if(test != null) { // null check 해서 처리하는 방식이 좋다.
            System.out.println(test.name); // nullPointerException 은 발생하면 안된다.
        }
        else{
            System.out.println("test 객체가 없습니다.");
        }
    }
    static void arithmeticFunc(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("첫번째 값 : ");
            int x = scanner.nextInt();
            System.out.print("두번째 값 : ");
            int y = scanner.nextInt();
            int rst = x / y;
            System.out.println(rst);
        }
        catch (ArithmeticException | InputMismatchException e){
            System.out.println(e+" 오류 발생");
        }
        finally{
            System.out.println("무조건 수행되는 구문");
        }
    }
}

class Test{
    String name = "민지";
}
