package 상속기본;
// 자식클래스가 부모 클래스의 기능을 그대로 물려받는 것
// 상속받은 자식클래스는 부모클래스와 같거나 크다.
// 부모클래스가 먼저 생성되고 자식 클래스 생성, 소멸시에는 자식 클래스 사라지고 부모 클래스 소멸
// 사용하는 이유는 1.재사용성, 2.확장성, 3.다형성(오버라이딩, 상속받은 기능을 재정의)
// 자바는 다중 상속을 지원하지 않음 (다중상속과 유사한 기능을 제공하기 위해서 관련 인터페이스가 있음)
// 키워드 extends
// 상속을 받지 않은 클래스는 기본적으로 Object 클래스로부터 상속을 받음
// 오버라이딩은 부모가 물려준 기능을 재정의하는 것 (재정의하지 않으면 부모의 메소드 호출 됨)
// 단 그 부모에게도 같은 메소드가 있는 상황에서만
public class InheritanceBasicEx {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("댕댕이");
        System.out.println(dog.getName()); // 부모가 물려줬기 때문에 setName/getName 사용 가능
        dog.sleep();
        HouseDog houseDog = new HouseDog();
        houseDog.setName("댕댕이");
        houseDog.sleep();
        houseDog.sleep(2);
    }
}

class Animal { // Animal이 제일 위 다음 Dog 다음 HouseDog
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class Duck extends Animal{ // 계층적 상속
    void sleep(){
        System.out.println(name+" qqq");
    }
}
class Dog extends Animal{ // class 자식 extends 부모
    void sleep() {
        System.out.println(name+" zzz");
    }
}
class HouseDog extends Dog{ // class 자식 자식 -> extends 자식 (다단계 상속)
    @Override // Override 관계가 유지되고 있는지에 관해 확인할 수 있는 문법 // @ -> annotation
    // 오버라이딩 관계가 성립하려면 메소드의 이름과 반환 타입도 같아야함
    void sleep(){
        System.out.println(name+" zzz in house"); // 이 부분을 막으면 위에 sleep이 들어감 (zzz)
    }
    // 오버라이딩 이후 오버로딩
    // 오버라이딩 -> 상속
    void sleep(int hour){
        System.out.println(name+" zzz in house for "+hour+" hour");
    }
}