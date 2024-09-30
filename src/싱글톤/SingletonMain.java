package 싱글톤;
// 단 하나만 생성된다고 해서 이 객체를 싱글톤이라고 함 -> 객체를 하나만 생성 -> 공유
// 클래스 간의 데이터 공유가 쉽다.
// 메모리 절약
// Synchronized 문제 -> 동시에 읽고 쓰면 깨질 가능성이 있음
// 동시접근 / 멀티스레드 / 비동기화 / 동기화
// * 싱글톤이란? 단 하나의 객체만 생성하는 디자인 패턴
// * 장점은 메모리 절약, 생성된 하나의 객체를 재활용해서 사용(스프링부트 빈 컨테이너에서 사용)
// * 또 다른 장점은 클래스로 생성된 객체간의 정보 공유가 쉬움 (안드로이드나 iOS 사용되는 방식)
// * 단점은 동시성 문제가 발생할 수 있음 (Critical section?) (얕은 복사, 깊은 복사 -> 다시 복습 필요)

public class SingletonMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setInfo("안유진", 21);
        student2.viewInfo();
    }
}

