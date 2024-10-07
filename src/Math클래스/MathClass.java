package Math클래스;

import java.math.BigDecimal;
import java.math.RoundingMode;

// Math 클래스의 모든 메소드는 클래스 메소드(static method)이므로, 객체를 생성하지 않고도 바로 사용 가능
// 클래스 메소드 : 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해 놓은 클래스
// java.lang에 포함되어 있어 별도의 import가 필요 없음
public class MathClass {
    public static void main(String[] args) {
        randomFunc();
        MathMethodFunc();
    }
    // random() 메소드 0.0 이상에서 1.0 미만의 범위에서 임의의 double형 값 한개를 반환
    static void randomFunc() {
        for (int i = 0; i < 6; i++) {
            System.out.print((int) (Math.random() * 100) + 1 + " "); // 1~100 사이의 임의의 수 생성
        }
        System.out.println();
    }
    // abs() 메소드 : 절대값 구하는 메소드
    // floor() : 주어진 숫자를 내림한 결과를 반환
    // ceil() : 주어진 숫자를 올림한 결과를 반환
    // round() : 소수점 첫째 자리에서 반올림 결과를 반환
    // BigDecimal() 메소드를 import 해서 사용하는 방법이 권장되는 방식
    static void MathMethodFunc(){
        System.out.println(Math.abs(-10)); // 10을 반환
        System.out.println(Math.abs(10)); // 10을 반환
        // floor() : 내림
        System.out.println(Math.floor(10.99999999));
        // ceil() : 올림
        System.out.println(Math.ceil(10.000000001));
        // round() : 반올림 -> int 형
        System.out.println(Math.round(10.499999999));
        System.out.println(Math.round(10.5999999999));
        // min()과 max()
        System.out.println(Math.min(20,30));
        System.out.println(Math.max(20,30));
        BigDecimal number = new BigDecimal("10.345");
        System.out.println(number.setScale(2, RoundingMode.HALF_UP));
    }
}
