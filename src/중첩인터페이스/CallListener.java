package 중첩인터페이스;

public class CallListener implements Button.OnClickListener { // 버튼 클래스의 OnClickListener 인터페이스 상속
    @Override
    public void onClick() {
        System.out.println("전화를 겁니다.");
    }
}
