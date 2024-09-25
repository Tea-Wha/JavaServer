package While반복문;
// While 문 : 주어진 조건이 참인 동안 반복, 횟수가 정해지지 않은 경우에 많이 사용
// do ~ while 문 : 선 실행 후 조건 비교

import java.util.Scanner;

public class WhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
//        while (true){ // 변수를 루프 문에서 사용할 때는 변수를 밖에서 미리 지정하는 것이 좋은 코드
//            System.out.print("나이 입력 : ");
//            age = scanner.nextInt();
//            if (age >= 0 && age <= 200) break; // 탈출 조건 -> 정상적인 값이 입력되었을 시 탈출
//            System.out.println("나이를 잘못 입력 하셨습니다.");
//        }
        
        do {
            System.out.print("나이 입력 : ");
            age = scanner.nextInt();
        } while (age < 0 || age > 200); // 이 조건 안에 들어가 있으면 반복 (탈출이 아닌 반복)
        
        System.out.println("당신의 나이는 "+ age + "입니다.");
    }
}
