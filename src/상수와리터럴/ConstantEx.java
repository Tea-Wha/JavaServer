package 상수와리터럴;

import java.util.Scanner;

// 상수란? 메모리에 값이 한번 지정되면 변경할 수 없음
// 자바에서는 상수 정의를 final 키워드를 사용
// 상수는 관례상 모두 대문자로 선언
public class ConstantEx {
    public static void main(String[] args) {
        final double TAX_RATE = 0.10; // 상수 선언시 관례상 대문자로 변수 이름 선언
        // 선언과 동시에 값을 넣지 않아도 됨 (JAVA는)
        // 콘솔에서 입력 받기 위해서는 스캐너 클래스에 대한 객체를 생성해야 함
        // Memory 분류 -> Static / Heap / Stack
        // Stack -> 지역변수 -> 자동소멸 (Block 만나면) / 초기화 안함 (last input first output)
        // Heap -> 동적 할당 영역 / 메모리 해제 필요 
        // Static -> 프로그램이 끝날때까지 살아있음
        Scanner sc = new Scanner(System.in); // new -> 동적 할당 
        // sc -> 변수 (Stack 메모리) -> (Scanner의 주소 할당 받음) /참조 변수지만 위치는 지역 변수
        // Block 만나면 소멸 (지역 변수)
        // Java에서는 할당받은 지역 변수가 사라지면 참조 변수도 사라지게 함
        System.out.print("수입을 입력 하세요 : ");
        int income = sc.nextInt();
        System.out.println("당신의 내야 할 세금은 : "+income*TAX_RATE);
        System.out.printf("당신이 내야 할 세금은 : %.3f", income*TAX_RATE);
    }
}
