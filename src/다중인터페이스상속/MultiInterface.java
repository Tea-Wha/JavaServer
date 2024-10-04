package 다중인터페이스상속;
// 인터페이스는 무조건 overriding이 필수다.

public class MultiInterface {
    public static void main(String[] args) {
        SportsCar porshe = new SportsCar(false, 18, false, false);
        porshe.viewInfo();

    }
}
