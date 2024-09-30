package 추상클래스;

public class SmartPhone extends Phone {
    public SmartPhone(String name) { // 생성자 불러야함
        super(name);
    }

    @Override
    void call() { // 추상 메소드 불러야함 // 오버라이딩이 필수가 된다.
        System.out.println("부모의 요청으로 통화 기능을 구현합니다.");
    }
    public void internet(){
        System.out.println("인터넷을 검색합니다.");
    }
}
