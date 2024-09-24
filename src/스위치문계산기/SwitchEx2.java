package 스위치문계산기;
// switch 문으로 간단한 계산기 만들기

import java.util.Scanner;
public class SwitchEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(); // 좌변
        char op = scanner.next().charAt(0); // 연산자
        int y = scanner.nextInt(); // 우변

        switch(op){
            case '+':
                System.out.println("덧셈 : "+(x+y));
                break;
            case '-':
                System.out.println("뺄셈 : "+(x-y));
                break;
            case '*':
                System.out.println("곱셈 : "+(x*y));
                break;
            case '/':
                System.out.println("나눗셈 : "+(double)x/y);
                break;

            default:
                System.out.println("연산자를 잘못 입력했습니다.");

        }

        
    }
}
