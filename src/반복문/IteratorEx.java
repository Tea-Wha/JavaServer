package 반복문;
// 반복문이란? 주어진 조건이 참인 동안 혹은 정해진 횟수 만큼 반복적으로 프로그램을 수행하는 것
// while 문, do ~ while 문, for 문(범위 기반), Enhanced for 문(요소의 개수를 자동 순회)

import java.util.Scanner;
public class IteratorEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = scanner.nextInt();
        int sum = 0; // 값을 누적하기 위한 변수
//        while (n > 0){ // while 문에 변수 값을 바로 넣을 수 없다 / 조건식이 필요함
//            sum += n; // sum = sum +n;
//            n--;      // n = n-1 // 대입 관계가 없으면 전위 후위 상관 없음
//        }
//        System.out.println("합계 : " + sum);
        int i = 1;
        for(; i <= n;){ // for 문과 while 문은 비슷한 형태를 갖는다.
            sum +=i;
            i++;
        }
        System.out.println("합계 : " + sum);
    }
}
