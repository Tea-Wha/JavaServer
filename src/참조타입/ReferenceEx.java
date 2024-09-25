package 참조타입;
// 참조타입이란? 할당된 변수에 실제 값이 저장되는 것이 아니라 주소가 저장됨
// 참조하는 대상이 없는 경우 : null point exception

public class ReferenceEx {
    public static void main(String[] args) {
        String name = ""; // 빈 문자열 (내용이 없음)
        String name2 = null; // 참조하는 대상이 없음
        System.out.println(name2);
        int age = 0;
        // int age1 = null; null 값 사용 불가, 참조 타입이 아니기 때문
        Integer age2 = null; // Integer 는 기본, 참조 타입 둘 다 가능?
        Integer age3 = 0; // 래퍼 클래스 -> Auto unboxing 기능이 있음

        int[] arr = null; // 참조 타입은 초기값을 null 지정 (배열 -> 참조 타입)

        Integer boxVal = null;
        int intVal = boxVal; // 참조 타입의 값을 대입 but 대상이 없음 (null)
        System.out.println(intVal);
    }
}
