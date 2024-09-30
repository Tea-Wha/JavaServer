package 정적멤버메소드;

public class Bank {
    private static int count = 0; // 정적 멤버 / 정적 필드 (클래스 생성시 생성) (static 이 무조건 붙음)
    private int account; // 잔액 표시, 인스턴스 필드, 객체가 생성될 때 함께 생성
    private String bank; // 은행 이름, 인스턴스 필드
    public Bank(String name, int account){
        count ++; // 계좌 개설 개수 확인용, 정적 멤버, 생성자 호출될 때 값이 증가됨
        this.bank = name;
        this.account = account; // 정적 멤버는 this 안됨
    }
    public static int getCount(){ // static 메소드에서는 인스턴스 필드 접근 불가능
        // 메소드에서는 기본적으로 this가 붙어 있음 // 정적 메소드
        return count;
    }
    public void setDeposit(final int dep){ // final
        // dep += 100; -> dep 관련되어 변경이 아예 불가능하게 만든다 (final)
        account += dep; // 잔액에 입금 금액을 더해서 잔액을 누적
        System.out.println(dep+"을 입금 했습니다.");
    }
    public void setWithdraw(final int with){
        if(with > account){
            System.out.println("잔액이 부족합니다.");
        } else {
            account -= with;
            System.out.println(with+"을 출금 했습니다.");
        }
    }
    public int getAccount() {
        return account;
    }
    public String getBank(){
        return bank;
    }
}
