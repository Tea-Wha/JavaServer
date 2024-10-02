package 디폴트메소드;
// 디폴트 메소드 : 인터페이스에서 구현부가 있는 메소드를 의미

public interface RemoteControl {
    int MAX_VOLUME = 100; // 인터페이스에 포함된 필드는 모두 상수로 만들어짐(final static 추가됨)
    int MIN_VOLUME = 0; // 설계명세에서 볼륨의 설정 범위를 표시하기 위해서 사용할 수 있음
    void turnON(); // 자동으로 public abstract가 추가됨
    void turnOFF();
    void setVolume(int volume);
    // 디폴트메소드는 이후 추가 (예외 조항)
    default void setMute(boolean mute) { // 추상 메소드를 추가하면 기존에 상속되어 있었던 모든 자식 클래스
        // 추가 설정이 필요해진다.
        // 디폴트메소드로 추가한다면 방지 가능
        // 상속 받은 클래스에서 오버라이딩 해도 되고, 하지 않아도 됨
        if(mute) System.out.println("무음 처리 합니다.");
        else System.out.println("무음 처리를 해제 합니다.");
    }
    
    // 인터페이스 생성 시 함께 생성되고 상속되지 않음
    static void changeBattery(){ // 정적 메소드 가능??
        System.out.println("건전지를 교환 합니다.");
    }
}
