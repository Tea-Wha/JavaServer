package 연산자연습;

import java.util.Scanner;

// 산술연산자 : +, -, *, /, % (//, ** 없음)
// 대입연산자 : =, +=, -=, *=, /=, %=
// 증감연산자 : ++, -- (현재값에서 1을 증가시키거나 감소시키는 연산자)
// 비교연산자 : >, <, >=, <=, !=, ==
// 논리연산자 : &&(and), ||(or), !(not)
// 삼항연산자 : 조건식 ? 참인 경우 수행 구문 : 거짓인 경우 수행 구문
// 비트연산자 : 비트 단위의 저수준 조작을 하기 위한 연산자
public class OperatorEx {
    public static void main(String[] args) {
        int num1 = 10, num2 = 3;
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2); // 정수끼리 나눗셈을 수행하면 몫이 나옴
        System.out.println(num1 % num2);
        System.out.println((double)num1/num2); // 형변환 필요 -> 나눗셈 수행 가능
        
        // 증감 연산자 : 해당 변수값을 1 증가 또는 감소 시키는 연산자
        num1 += 1;
        System.out.println(num1++); // 후위 증가연산자, 선 대입 후 증가
        System.out.println(num1);
        System.out.println(++num1); // 전위 증가연산자, 선 증가 후 대입

        System.out.println(num1 += 2);
        System.out.println(num1 -= 2);
        System.out.println(num1 *= 2);
        System.out.println(num1 /= 2);
        
        // 비교 연산자 : 두개의 피 연산자를 비교하여, 큰지, 작은지, 같은지를 판단하는 것
        // 결과 값은 boolean 값으로 반환(true / false)

//        int x = 10, y = 20;
//
//        System.out.println(x>y); // false
//        System.out.println(x<y); // true
//        System.out.println(x == y); // false
//        System.out.println(x != y); // true
//        System.out.println(x >= y); // false
//        System.out.println(x <= y); // true
        
        // 논리 연산자 :
        // &&(and) 둘 다 만족해야 참, A 이고 B
        // ||(or) 둘 중 하나만 만족해도 참, A 이거나 B
        // !(not) 현재의 조건에 대한 부정이므로 반대가 됨 (0 -> 1) (1 -> 0)

        int x = 10, y = 20;
        boolean rst1, rst2, rst3;
        rst1 = (x > 0) && (x > y); // false
        rst2 = (x > 0) || (x > y); // true
        rst3 = !((x > 0) || (x > y)); // false
        System.out.println(rst1 + " " + rst2 + " " + rst3);

        Scanner sc = new Scanner(System.in);
        System.out.print("나이 입력 : ");
        int age = sc.nextInt();
        String isAdult = (age > 19) ? "성인" : "미성년자" ; // 삼항 연산자
        System.out.println("당신은 " + isAdult + "입니다.");

        System.out.println("Java" + 18.04 + 12);
        System.out.println(3+3.3+"JDK");
        
        // 연산자 우선 순위 확인
        int val1=5, val2=5, val3=5;
        System.out.println(val1 + val2 * val3); // 30
        System.out.println((val1+val2)*val3); // 50
        System.out.println((val1 + ++val2)*val3); // 55

        // instance method

        // 100자리 정수를 입력 받아서 3개의 변수에 나누어 담아서 출력하기

        Scanner scan = new Scanner(System.in);
        System.out.print("100자리 정수를 입력 : ");
        int num = scan.nextInt(); // 스캐너 클래스로 만들어진 인스턴스 메서드
        int a = num/100;
        int b = (num-a*100)/10; // (num%100)/10;
        int c = num-a*100-b*10; // (num%100)%10;
        System.out.println("100의자리 정수 a : " + a +" 10의자리 정수 b : " + b + " 1의자리 정수 c : " +c);
    }
}

// 비트 연산자
// 자바는 비트 연산자를 제공하여 숫자의 비트 수준 조작을 할 수 있다.
// 이러한 비트 연산자는 정수형 변수들의 비트를 조작하고, 비트 패턴에 대한 다양한 연산을 수행할 때 사용됨
// 1. 성능 최적화 - 비트 연산은 CPU가 직접 수행 -> 고속 작동
// 2. 데이터 압축과 암호화 - 비트 연산을 사용하여 데이터 압축 및 암호화하는 알고리즘 구현 가능
// 3. IP 주소 처리, 서브네팅 계산 등 네트워크 주소를 계산하고 조작하는 데 비트 연산이 필수적
// 4. 플래그와 설정 관리 - 여러 설정이나 상태를 나타내는 플래그를 한 변수에 저장하고, 이를 효율적으로 관리하기
// 위해 비트 연산 사용
// 5. 그래픽스 프로그래밍 - 비트 연산은 픽셀 데이터 처리 및 이미지 비트맵 조작에 사용
// 6. 게임 개발 : 게임 상태 관리, 리소스 관리, 충동 감지 등에서 비트 연산 사용
// 7. 하드웨어 인터페이스와 드라이버 개발 : 하드웨어 장치 레지스터 직접 조작, 특정 하드웨어 기능 활성화/비활성화