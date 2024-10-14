package 함수형프로그래밍;
// 메소드 참조는 메소드를 참조해서 매개 변수의 정보 및 리턴 타입을 알아내어, 불필요한 매개 변수를 제거하는 것이 목적


import java.util.function.IntBinaryOperator;

class Calculator1{
    static int staticMethod(int x, int y){
        return x + y;
    }
    int instanceMethod(int x, int y){
        return x+y;
    }
}

public class MethodReference {
    public static void main(String[] args) {
        // 함수형 인터페이스 / 두 개의 int 타입 값을 받아 int 값을반환하는 이항 연산자
        IntBinaryOperator operator;
        // 정적 메소드 참조
        operator = (x, y) -> Calculator1.staticMethod(x,y);
        System.out.println("결과 : "+operator.applyAsInt(1,2));
        
        // 정적 메소드 참조
        operator = Calculator1::staticMethod;
        System.out.println("결과 : "+operator.applyAsInt(3,4));
    }
}
