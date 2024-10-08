package 리스트인터페이스;
// List(ArrayList, Vector, LinkedList)
// List 인터페이스는 ArrayList, Vector, Linked List에 상속을 주기 위한 인터페이스
// List는 배열과 비슷한 형태의 자료 구조(인덱스 기반), 동적으로 크기가 변함
// 요소의 저장 순서가 유지됨
// 같은 요소의 중복 저장을 허용
// 데이터 크기가 고정되어 있지 않음 -> 동적 할당
// 데이터를 다루기 위한 다양한 메소드 제공
// List 인터페이스의 구현체인 ArrayList Vector, Linked List의 사용 방법이 동일
// 리스트는 인덱스 기반
// Vector -> ArrayList와 동일한 내부 구조
// Vector -> 동기화된 메소드로 구성되어 있어 멀티 스레드 환경에서 안전하지만 성능이 떨어짐
// 동기화 -> 한 사람 사용 시 잠김

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // 리스트 참조 변수에 ArrayList 대입 (부모 클래스)
        ArrayList<String> list2 = new ArrayList<>(); // 어레이리스트 참조 변수 (자식 클래스)
        // 부모 클래스로 지정시 ArrayList에서 다른 Vector나 LinkedList로 변경 시 코드를 수정할 필요가 없다.
        // List 인터페이스의 참조 변수로 ArrayList 로 생성된 객체를 참조함
        String[] fruitsArr = {"Watermelon", "Peach", "Cherry"};
        // Arrays.asList() 배열을 리스트로 변환하는 메소드
        List<String> fruits = new ArrayList<>(Arrays.asList(fruitsArr));
        
        // Heap 영역에는 데이터가 들어가지 않음 -> 참조 변수가 들어감 -> 주소가 들어감
        // 요소 추가, 리스트 맨 뒤에 요소를 추가
        fruits.add("Apple"); // O1
        fruits.add("Banana");
        fruits.add("Orange");

        // 리스트 출력, toString() 메소드가 오버라이딩 되어 있음
        System.out.println("과일 목록 : "+fruits); // toString()은 자동으로 동작
        // 검색이 자주 되면 ArrayList
        // 삽입이 빈번하면 LinkedList
        
        // 특정 인덱스에 요소 추가 -> 삽입 방식 / LinkedList는 연결 변경 방식으로 진행 (빠름)
        fruits.add(1,"Grape");  // On
        System.out.println("과일 목록 : "+fruits);

        // 요소 가져오기(인덱스 접근)
        System.out.println("과일 요소 : "+fruits.get(2));

        // 요소 제거하기
        fruits.remove(2);
        System.out.println("과일 목록 : "+fruits);
        
        // List 사이즈 확인
        System.out.println("과일 목록 사이즈 : "+fruits.size());
        
        // 요소 순회 하기
        for(String e : fruits){
            System.out.print(e + " ");
        }
        System.out.println();
        
        // 리스트 정렬하기
        fruits.sort(Comparator.naturalOrder()); // 오름차순 정렬
        System.out.println("과일 목록 : "+fruits);
        fruits.sort(Comparator.reverseOrder()); // 내림차순 정렬
        System.out.println("과일 목록 : "+fruits);
        fruits.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1;
                else if (o1.length() == o2.length()) return o1.compareTo(o2);
                else return -1;
            }
        });
        System.out.println("과일 목록 : "+fruits);

        // ArrayList 에는 일반형이 오면 안됨 -> List는 Generic -> 일반화 되었기 때문에 주소 형태로 통일
        List<Integer> numbers = new ArrayList<>(); // 래퍼 클래스 -> 참조 변수 -> 주소
        numbers.add(200); // 정수가 들어가는 것이 아니라 정수가 저장된 주소가 들어가게 됨 (기본 타입 X 참조 타입 O)
    }
}
