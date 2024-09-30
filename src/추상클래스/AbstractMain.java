package 추상클래스;
// 추상클래스 : 인스턴스화가 안되는 클래스
// 부모가 만든 추상메소드는 자식이 반드시 구현 해야 함
// 단일 상속만 지원
// 명시적으로 abstract 키워드를 사용해야 함
// 일반 메소드도 포함할 수 있음

public class AbstractMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("iPhone Pro 16");
        smartPhone.setPower(true);
        smartPhone.internet();
        smartPhone.call(); // 부모 클래스에는 call 기능 없음

        Phone phone = new SmartPhone("iPhone Pro 16");
        phone.setPower(true);
        phone.call();
//        phone.internet();
    }
}
