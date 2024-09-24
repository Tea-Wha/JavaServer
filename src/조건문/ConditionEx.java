package 조건문;
// 제어문 : 프로그램의 순차적인 흐름을 제어할 때 사용
// 제어문에는 조건문과 반목문이 있음
// 조건문 : 
// - if, if ~ else, if ~ else if ~ else
// - switch ~ case 문 -> 조건식은 올 수 없고 조건 값만 올 수 있음
// - 삼항연산자 -> 쓸 수 있다면 제일 먼저 사용하는게 좋을거 같다 정도

import java.util.Scanner;
public class ConditionEx {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("정수값 입력 : ");
//        int num = sc.nextInt();
//
//        // 한줄 짜리 조건문은 중괄호 생략이 가능하다.
//
//        if (num > 100){
//            System.out.println(num + "은 100보다 큰 수 입니다.");
//        } else if (num == 100){
//            System.out.println(num + "은 100 입니다.");
//        } else {
//            System.out.println(num+"은 100보다 작은 수 입니다.");
//        }
        Scanner sc = new Scanner(System.in);
        System.out.print("문자를 입력 : ");
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z'){
            System.out.println(ch+"는 소문자 입니다.");
        } else if (ch >='A' && ch <= 'Z'){
            System.out.println(ch+"는 대문자 입니다.");
        } else{
            System.out.println(ch + "는 알파벳이 아닙니다.");
        }
    }
}
