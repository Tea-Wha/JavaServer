package 오브젝트클래스;
// java.lang 패키지 중에서도 가장 많이 사용되는 클래스 -> Object 클래스
// Object 클래스 : 모든 자바 클래스의 최고 조상 클래스
// Object 클래스는 필드 없이 11개(?)의 메소드로 구성
public class ObjectClass {
    public static void main(String[] args) {
        Student student = new Student(); // student -> 주소?
        Student student1 = new Student(); // new -> 동적 할당
        System.out.println(student.getClass()); // 해당 객체의 클래스 타입을 반환
        
        // String인 경우에는 문자열의 내용을 비교하는 동작
        // equal() 메소드는 해당 인스턴스와 매개변수로 전달받는 참조 변수와 비교하여 결과를 반환
        // 해시코드를 비교함 -> 할당된 메모리 주소가 반환되는것이 해시코드 (Java)
        // 실제 메모리 주소 -> Hash function -> Hash code (역으로는 못찾아냄) (메모리 주소를)
        // hash code 가 같은면 -> 같은 객체로 인식 / hash code 가 다르면 -> 다른 객체로 인식
        System.out.println(student.equals(student1));
        student = student1;
        System.out.println(student.equals(student1)); // 해시코드 값 비교
        // 메모리에 로딩된 객체의 주소를 해시함수에 키값으로 전달하고 해시함수로 생성된 해시코드 값 반환/비교
        System.out.println(student.hashCode()); // 
        System.out.println(student1.hashCode());
        // toString() 대부분의 경우는 오버라이딩해서 객체 내부의 정보를 표시함
        // 오버라이딩을 하지 않는 경우는 해당 객체의 정보를 문자열로 출력
        // 패키지이름.클래스이름@해시코드에 대한 16진수표기
        System.out.println(student.toString());
        System.out.println(student1.toString());
    }
}

class Student{
    int id;
    String name;
}