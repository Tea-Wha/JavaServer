package 스택기본;
// Stack -> LIFO(Last in First Out) 구조 -> JVM 스택 메모리
// 스택 메모리에 저장된 변수는 나중에 저장된 것 부터 먼저 제거됨
// Stack은 내부적으로 Vector 클래스를 상속 받아 만들어짐 -> 자바에서 Stack 은 Vector 의 모든 기능(메소드) 사용 가능
// Stack 만의 메소드 추가 (push/peek 등)
// push(item) : 객체 저장 / peek() : 스택 맨 위 값 확인 / pop() : 스택 맨 위 값 추출 & 표시 / empty() : 비어 있는지 확인


import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        System.out.println(stack.size());
        System.out.println(stack.contains(1));
        System.out.println(stack.contains(2));
    }
}
