package 다운캐스팅;

import java.util.ArrayList;
import java.util.List;

// 상위 클래스형으로 변환되었던 하위 클래스를 다시 원래 자료형으로 변환하는 것을 다운 캐스팅이라고 한다.
// 즉, 부모 클래스 타입으로 선언된 객체 -> 하위 클래스 타입으로 형변환
// 타입 캐스팅 연산자 필요
// 해당 객체가 그 하위 클래스의 인스턴스일 때만 다운 캐스팅 가능
// 부모 클래스는 자식 클래스에서 만든 메소드에 접근할 수 없다는 단점을 해결하기 위한 것
// 인스턴스 instanceof 클래스 : 형 변환 가능 여부를 확인
// Backend에서 많이 사용됨
public class DownCasting {
    // Animal 타입의 요소로 이루어진 ArrayList 선언
    // 값이 아닌 주소 참조
    // List 안에 -> ArrayList, Vector, LinkedList
    // List는 interface 문법
    // List 접근은 Overriding 된 부분만 접근 가능 -> 다양한 접근으로 전환하는데 코드 수정이 편함 (호환성)
    // DB -> List //
    List<Animal> animals = new ArrayList<>(); // Animal 객체를 리스트로 참조 -> 자식 객체도 모두 가져옴
    public static void main(String[] args) {
        DownCasting downCast = new DownCasting(); // 새로운 다운캐스팅 클래스 생성
        downCast.addAnimal();
        downCast.downCasting();
    }
    public void addAnimal(){ // 다운캐스팅 안에 속해 있는 메소드 -> downCast에서 불러오기 가능
        animals.add(new Animal()); // Animal 클래스로 객체 생성 // 주소를 ArrayList 첫번째 요소에 // 1번
        animals.add(new Tiger()); // 상속 관계로 전부 (move) method에는 접근 가능 // 2번
        animals.add(new Human()); // 3번
        animals.add(new Eagle()); // 4번
        for(Animal e : animals) e.move();
    }
    public void downCasting(){ // 다운캐스팅 안에 속해 있는 메소드 -> downCast에서 불러오기 가능
        for (int i = 0; i < animals.size(); i++){
            Animal ani = animals.get(i); // ArrayList 해당 인덱스의 값을 가져옴 // Animal 또한 List 형태
            if(ani instanceof Human){
                Human h = (Human) ani; // 다운캐스팅은 명시적 형변환 필요 
                // ani 에 속해있는 Human으로 명시적 형변환
                h.readBook();
            }
            else if (ani instanceof Tiger){
                Tiger t = (Tiger) ani;
                t.hunting();
            }
            else if (ani instanceof Eagle){
                Eagle e = (Eagle) ani;
                e.flying();
            }
            else {
                System.out.println("지원되지 않는 형 입니다."); // 첫번재 인덱스가 Animal이기 때문에 
                // 처음에 지원되지 않는 형 입니다. 출력됨
            }
        }
    }
}


