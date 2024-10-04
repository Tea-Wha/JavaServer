package 객체배열관리;

import java.util.Arrays;
import java.util.Scanner;

public class ObjectArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 인원 : "); // 배열은 크기를 지정해야 함 -> 단점
        int cnt = scanner.nextInt();
        NameCard[] nameCards = new NameCard[cnt]; // NameCard 클래스(참조타입) 타입의 배열 생성

        System.out.println("정보 입력");
        System.out.println("-".repeat(16));
        for (int i = 0; i < nameCards.length; i++){
            nameCards[i] = new NameCard(); // 해당하는 배열의 인덱스에 생성된 객체의 주소를 대입
            System.out.print("이름 : ");
            nameCards[i].setName(scanner.next()); // i 번째의 nameCard 에 setName 대입
            System.out.print("이메일 주소 : ");
            nameCards[i].setEmail(scanner.next());
            System.out.print("핸드폰 번호 : ");
            nameCards[i].setPhone(scanner.next());
            System.out.print("나이 : ");
            nameCards[i].setAge(scanner.nextInt());
        }
        for (NameCard e : nameCards) e.printInfo(); // 메소드 불러오기
        // NameCard 클래스 참조 변수 e
        // nameCards 이미 생성되고 입력이 끝난 NameCard 타입 배열
    }
}
