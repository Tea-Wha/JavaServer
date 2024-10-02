package 인터페이스;
// 다중 상속 -> 자식 클래스가 여러 부모 클래스를 상속받는 것
// 자바에서는 클래스를 통한 다중 상속 지원 X
// 인터페이스를 통해 -> 다중 상속
// 인터페이스 : 다른 클래스를 작성할 때 기본이 되는 틀 제공, 다른 클래스 사이의 중간 매개 역할까지 담당하는
// 일종의 추상 클래스
// 추상 클래스 -> 추상 메소드, 생성자, 필드, 일반 메소드 포함 가능
// 인터페이스 -> 추상 메소드, 상수만 포함 가능
// 인터페이스란? 자바에서 다중 상속을 지원하기 위해서 만들어짐
// 인터페이스 개발에 있어서 설계명세서 개념이라고 생각하면 됨
// 완벽한 추상화 : 모든 메소드가 추상 메소드임 (단, 예외가 있음)
// 인터페이스에 포함되는 필드 : final static 이 자동으로 추가됨(컴파일러) - 상수가 됨
// 인터페이스에 포함되는 메소드 : public abstract 가 자동으로 추가됨(컴파일러) - 추상메소드가 됨
// 정적메소드 : 객체와 상관없으므로 사용해도 됨 (구현부가 있음)
// 인터페이스 상속은 implements 키워드를 사용하고, 상속받는 개수는 무한대
// 인터페이스 문법을 사용하는 느슨한 결합관계를 달성하기 위해서 사용

import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        NetworkAdapter adapter; // 객체화가 될 수 없음
        Scanner scanner = new Scanner(System.in);
        System.out.print("연결할 네트워크 선택 [1]WiFi [2]5G [3]LTE : ");
        int num = scanner.nextInt();
        switch (num){
            case 1: adapter = new WiFi("KT Megapass"); adapter.connect(); break;
            case 2: adapter = new FiveG("SK Telecom"); adapter.connect(); break;
            case 3: adapter = new Lte("LG U+"); adapter.connect(); break;
            default: System.out.println("네트워크에 연결되지 않았습니다. 다시 시도하세요.");
        }
    }
}
