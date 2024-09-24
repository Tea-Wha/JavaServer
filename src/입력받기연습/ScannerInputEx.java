package 입력받기연습;
// 이름 : String, next ()
// 주소 : String, nextLine()
// 성별 : char, next().charAt(0)
// 나이 : int, nextInt()
// === 회원 정보 출력 ===
// 이름 :
// 주소 :
// 성별 :
// 나이 :

import java.util.Scanner;
public class ScannerInputEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 입력 : ");
        String name = sc.next();  // 입력이 되고나서 엔터가 들어가니 \n 이 남아있는 상황
        sc.nextLine(); //버퍼 지우기
        System.out.print("주소 입력 : "); // 버퍼 지우기가 없다면 \n 을 입력 받고 바로 넘겨지게 되는 상황
        String address = sc.nextLine();
        System.out.print("성별 입력 : ");
        char gender = sc.next().charAt(0);
        System.out.print("나이 입력 : ");
        int age = sc.nextInt();
        System.out.println(" ");

        System.out.println("=== 회원 정보 출력 ===");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + address);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);

    }
}
