package 스택기본;
// Stack -> LIFO(Last in First Out) 구조 -> JVM 스택 메모리
// 스택 메모리에 저장된 변수는 나중에 저장된 것 부터 먼저 제거됨
// Stack은 내부적으로 Vector 클래스를 상속 받아 만들어짐 -> 자바에서 Stack 은 Vector 의 모든 기능(메소드) 사용 가능
// Stack 만의 메소드 추가 (push/peek 등)
// push(item) : 객체 저장 / peek() : 스택 맨 위 값 확인 
// pop() : 스택 맨 위 값 추출 & 표시 -> 반환값 있음 / empty() : 스택이 비어 있는지 확인
// LIFO : 프로그래밍에서는 함수 호출 구조가 대표적인 예
// 일상생활에서의 예는 접시

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); // Integer -> 객체
        stack.push(1); // Generic 타입이지만 Integer 내부에서 autoboxing 이루어짐
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek()); // 최상위의 값 확인
        System.out.println(stack.pop()); // 최상위의 값을 추출하면서 보여줌
        System.out.println(stack.peek());
        System.out.println(stack.empty()); // 스택이 비어있는지 확인
        System.out.println(stack.size()); // 스택에 포함된 요소의 개수
        System.out.println(stack.contains(1)); // 스택 내에 해당 값이 존재하는지 확인
        System.out.println(stack.contains(2));
    }
}
