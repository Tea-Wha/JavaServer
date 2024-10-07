package 제네릭;

import java.util.ArrayList;
import java.util.List;

// 제네릭 : 데이터의 타입을 일반화한다는 의미
// (데이터 형식에 의존하지 않고, 하나의 값이 여러 다른 데이터 타입을 가질 수 있도록 하는 방법)
// 데이터 타입 또는 자료구조에 상관없이 동일한 프로그래밍 가능
// 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시 미리 지정하는 방식 사용
// 컴파일 시에 미리 타입 검사 수행

public class Generic {
    public static void main(String[] args) {
        genericTypeVariableFunc();
    }
    // 제네릭 타입 제한 : 컴파일 시 타입 체크 가능, 타입 변환 제거
    static void genericBasicFunc(){
        List<String> list = new ArrayList<>(); // 제네릭 타입 <String> 미리 지정
        list.add("100");
        System.out.println(list.get(0));
    }
    static void genericTypeVariableFunc(){
        Person<String> p1 = new Person<>("안유진");// T -> 문자열로 동작
        Person<Integer> p2 = new Person<>(1004);
        System.out.println(p1.getInfo());
        System.out.println(p2.getInfo());
    }
}
// <T> : 타입 변수를 의미하며, 관례상 매개변수가 1개인 경우 대문자 T로 표기
class Person<T>{ // Generic 타입
    private T info;
    Person(T info){
        this.info = info;
    }
    public T getInfo() {
        return info;
    }
}
