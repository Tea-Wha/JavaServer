package 함수형프로그래밍;
// 람다와 스트림을 사용하면 요즘 유행하는 함수형 프로그래밍 스타일로 자바 코드 작성
// 함수형 프로그래밍은 하나의 프로그래밍 패러다임으로 정의되는 일련의 코딩 접근 방식
// 자료처리를 수학적 함수의 계산으로 취급하고 상태와 가변 데이터를 멀리하는 프로그래밍 패러다임
// 장점 -> 누가 코딩을 해도 똑같이 만들어짐 (코드의 양이 줄어들어서)(취향을 타지 않음)
// 함수형 프로그래밍 정의 :
// 1. 불변성(Immutability) : 함수형 프로그래밍에서 데이터는 변경할 수 없는 것으로 취급
// 2. 함수의 일급 객체(First-Class and Higher-Order Functions) :
// 함수는 "일급 객체"로 취급 -> 함수를 변수에 할당 가능, 다른 함수의 인자 전달, 함수로부터 반환값 받을 수 있음
// 3. 순수 함수(Pure Functions) :
// 순수 함수는 동일한 인자에 대해 항상 동일한 결과 반환, 외부 상태 변경 하지 않음, 외부 상태에 의존하지 않는 함수
// 4. 함수 조합(Function Composition) : 여러 함수를 하나의 연산으로 결합
// 5. 재귀(Recursion) : 함수형 프로그래밍에서는 반복문 대신 재귀를 사용하여 반복적인 처리 구현

// 람다란? 자바 8 버전에서 도입, 간단한 익명 함수를 생성하기 위한 방법을 제공
// 람다표현식은 주로 함수형 프로그래밍 스타일을 지원 (리액트 -> 함수형 프로그래밍 스타일)
// (매개변수 목록)->{구현부;}
// 타입 추론이 가능한 모든 것을 생략함
// 매개변수가 하나인 경우는 ()를 생략할 수 있음
// 구현부(함수의 몸체)가 하나의 명령문인 겨우 {} 생략 가능

// 함수형 인터페이스 : 자바의 경우는 함수가 단독으로 존재할 수 없음
// 람다식은 메소드 이름이 없고 메소드를 실행하는데 필요한 매개변수와 함께 매개변수를 활용한 실행 코드를 구현하는 것
// 람다식을 구현하기 위해 함수형 인터페이스를 만들고, 인터페이스에 람다식으로 구현할 인터페이스를 선언

import java.util.function.BiFunction;


public class LambdaEx {
    public static void main(String[] args) {
//        // 객체지향문법을 사용해서 구현
//        // MyCalculator 참조변수로 객체를 접근
//        MyCalculator calc = new MyCalculator();
//        // 인터페이스에서 상속받은 메소드인 sum 이 오버라이딩된 메소드를 호출
//        int rst = calc.sum(3,4);
//        System.out.println(rst);
        
//        // 람다식으로 구현하기
//        Calculator mc = (int a, int b) -> a + b; // 인터페이스를 상속 받아 클래스 대신에 람다식으로 구현
//        int rst2 = mc.sum(3,4);
//        System.out.println(rst2);
        
        // 매개변수가 있는 람다식 사용
        MyFuncInterface mi = x -> {
            int rst =x *5;
            System.out.println(rst);
        };
        mi.method(100);
        
        // 매개변수와 변환값이 있는 람다식 구현
        MyFuncInter2 mf2 = (x,y) -> x < y ? x : y;
        System.out.println(mf2.min(3,4));
    }

}

interface Calculator{ // 인터페이스 상속 받아 -> sum 동작
    int sum(int a, int b); // 자동으로 public abstract 가 추가 됨
}

class MyCalculator implements Calculator{

    @Override
    public int sum(int a, int b) {
        return a+b;
    }
}

@FunctionalInterface
interface MyFuncInterface{ // 메소드 하나밖에 못옴
    public void method (int x);
}

@FunctionalInterface
interface MyFuncInter2{
    public int min (int x, int y);
}