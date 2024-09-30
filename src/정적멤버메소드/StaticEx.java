package 정적멤버메소드;
// stack 영역 -> 지역변수
// 특징 1. 자동 초기화 2. 초기값 지정되지 않음 (쓰레기 값 가능성 있음)
// Heap 영역 -> 동적 할당
// 특징 1. new 실행 시 -> heap 영역 생성 2. garbage collector -> 청소
// static 영역 -> 정적변수
// 특징 1. 프로그램 실행 시 생성 / 프로그램 종료 시 소멸

// static 멤버와 메서드는 클래스 생성 시 함께 생성되고, 객체가 생성 시 만들어지지 않음
// 하나의 클래스 한개만 존재
// 한번 생성되면 프로그램 종료시까지 사라지지 않음
// 정적(static) 메소드에서는 인스턴스 필드나 메소드를 사용할 수 없음 (인스턴스 필드, 메소드 -> 객체에서 만들어짐?)

public class StaticEx {
    public static void main(String[] args) {
        Bank kakao = new Bank("카카오", 1000);
        Bank shinhan = new Bank("신한", 1000);
        Bank nh = new Bank("농협", 1000);
        kakao.setDeposit(3000);
        kakao.setWithdraw(2000);
        System.out.println(kakao.getBank()+"에 잔액이 "+kakao.getAccount()+"이 있습니다.");
        System.out.println("계좌가 " +Bank.getCount()+"번 "+"개설 되었습니다.");

        System.out.println(Util.max(100,200));
        System.out.println(Util.isEven(2));
        System.out.println(Util.isEven(123));
        System.out.println(Util.getCurrentDate("20240930"));
        System.out.println(Util.getCurrentDate());
    }
}
