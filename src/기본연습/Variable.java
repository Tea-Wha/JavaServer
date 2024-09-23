package 기본연습;

// 기본 타입 / 참조 타입
// 프로그램은 변수를 통해 특정 번지에 값을 저장하고 읽을 수 있다 -> 실제 물리 주소는 찾을 수 있다
// 대부분의 프로그래밍 언어는 메모리 공간에 저장할 위치를 운영체제가 결정하지만 ->  자바는 JVM이 한다.

public class Variable {
    public static void main(String[] args) {

        int age = 23;
        String name = "홍태화";

        System.out.println(name);
        System.out.println(age);

        
    }
}
