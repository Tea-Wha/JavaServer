package 중첩인터페이스;
// 중첩인터페이스 : 클래스 내부에 선언된 인터페이스
// 중첩인터페이스는 주로 UI 프로그래밍에서 이벤트 처리할 목적으로 활용

public class NestedInterface {
    public static void main(String[] args) {
        Button button = new Button(); // 버튼을 만들고
        button.setOnClickListener(new CallListener()); // 버튼을 이벤트에 연결
        // 버튼에 OnClickListener 인터페이스 대입 (setOnClickListener)
        // listener 부분에 CallListener로 새로 지정/만듬
        button.touch(); // 실행
        // touch 가 CallListener로 넘어감 / listener.onClick -> CallListener.onClick

        Button button1 = new Button();
        button1.setOnClickListener(new MessageListener());
        button1.touch();
    }
}
