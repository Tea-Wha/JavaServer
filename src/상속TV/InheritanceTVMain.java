package 상속TV;
// 상속, 오버로딩, 오버라이딩 기본 동작을 이용해 TV 만들기

public class InheritanceTVMain {
    public static void main(String[] args) {
//        ProductTV lgTV = new ProductTV("우리집 TV");
//        lgTV.setPower(true);
//        lgTV.setVolume(30);
//        lgTV.setChannel(30, true);
//        lgTV.tvInfo();
        // 부모 클래스의 참조 변수로 자식 객체를 참조
        ProtoTypeTV samsungTV = new ProductTV("남의집 TV"); // 참조 : 부모 -> 객체 : 자식
        samsungTV.setChannel(1900); // 부모와 자식안에 포함된 메소드 중에 겹치는 부분이 있으면
        // 부모는 자식에게 걸려 있는 함수에 접근할 수 있다. -> 자식에 걸려있는 함수에 적용된다.
        // 왜 그렇게 참조 및 객체를 해야되는가?
    }
}
