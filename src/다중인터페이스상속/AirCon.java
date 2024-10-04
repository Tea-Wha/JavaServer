package 다중인터페이스상속;

public interface AirCon {
    int MAX_TEMP = 30; // 상수 (앞에 final static 자동으로 붙음)
    int MIN_TEMP = 0; // 상수 처리
    void airConON(); // public abstract 자동으로 추가됨, 자식 클래스에서 반드시 오버라이딩 해야함
    void airConOFF();
    void setAirConTemp(int tmp);
}
