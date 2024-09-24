package 스캐너클래스;
// 기본적인 데이터 타입에 대한 입력을 Scanner 클래스 메서드를 사용하여 입력 받을 수 있음

import java.util.Scanner; // 스캐너 클래스는 util 패키지내에 존재하므로 import 해야 함

public class ScannerEx {
    public static void main(String[] args) {
        // sc : 스캐너 클래스에 대한 참조 변수 (값이 아닌 주소가 들어 있다) (Scanner 클래스로 만들어진 객체의 주소)
        // new : heap 메모리 할당, 동적 할당, 메모리에 대한 해제를 해야함
        // 스캐너 클래스 타입
        // System.in : 콘솔로 부터 입력을 받기 위한 객체로 생성
        Scanner sc = new Scanner(System.in); // sc 참조 변수 -> heap 영역의 메모리에 대응중 // 스캐너 객체 생성

        System.out.print("byte 타입 정수 입력 : ");
        byte a = sc.nextByte();
        System.out.print("short 타입 정수 입력 : ");
        short b = sc.nextShort();
        System.out.print("int 타입 정수 입력 : ");
        int c = sc.nextInt();
        System.out.print("long 타입 정수 입력 : ");
        long d = sc.nextLong();
        // next() : 공백 기준으로 문자열을 입력 받음, 그중에 해당 인덱스의 문자를 추출
        System.out.print("char 타입 문자 입력 : ");
        char ch = sc.next().charAt(0); // 스캐너는 문자에 대한 입력 방식 없음
        System.out.print("float 타입 실수 입력 : ");
        float e = sc.nextFloat();
        System.out.print("double 타입 실수 입력 : ");
        double f = sc.nextDouble();

        System.out.print("String 타입 문자열 입력 : ");
        String g = sc.next(); // 공백 기준으로 문자열 입력 받음
        sc.nextLine();
        System.out.print("String 타입 문자열 입력 : ");
        String h = sc.nextLine(); // 줄바꿈 문자 기준으로 문자열 입력 받음
        System.out.println("입력된 byte 타입 정수 : " +a);
        System.out.println("입력된 short 타입 정수 : " +b);
        System.out.println("입력된 int 타입 정수 : " +c);
        System.out.println("입력된 long 타입 정수 : " +d);
        System.out.println("입력된 char 타입 문자 : " +ch);
        System.out.println("입력된 float 타입 실수 : " +e);
        System.out.println("입력된 double 타입 실수 : " +f);
        System.out.println("입력된 String 타입 문자열 : " +g);
        System.out.println("입력된 String 타입 문자열 : " +h);
        
    }
}
