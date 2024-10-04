package 중첩인터페이스;

public class Button { // 버튼 클래스
    // OnClickListener 인터페이스에 대한 참조 변수, 외부에서 객체를 만들어서 주입하는 형태
    OnClickListener listener; // OnClickListener 상속 받은 객체
    // 인터페이스 참조 변수이기 때문에 다음과 같이 받음?
    void setOnClickListener (OnClickListener listener){
        // 메소드 변수에 인터페이스 참조 변수 넣기
        this.listener = listener; // 이 때 listener는 인터페이스의 참조 변수로 설정됨
    }

    void touch() { // touch 메소드 -> 인터페이스 참조 변수이기 때문에 onClick 메소드 사용 가능
        listener.onClick(); // 구현된 객체의 onClick() 메소드 호출
    }

    interface OnClickListener { // 인터페이스
        void onClick(); // 추상메소드 -> 오버라이딩
    }
}
