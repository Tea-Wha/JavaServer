package 익명객체;
// 프론트엔드에서 많이 사용됨
// 익명객체 -> 일회성 작업이나 간단한 구현을 위해 사용
// 1. 이벤트 핸들러 / 2. 쓰레드 생성 / 3. 인터페이스 구현 / 4. 객체 생성과 사용 분리
// 복잡한 기능을 가진 객체를 구현해야 할 때는 별도의 클래스나
// 인터페이스를 정의하여 가독성과 유지보수성을 높이는 것이 유리함
// 실제 상속을 주는 부분에 바로 구현부 구현?

public class AnonymousObject {
    public static void main(String[] args) {
        Child child = new Child();
        child.methodParent();
        Child1 child1 = new Child1();
        child1.parent.methodParent(); // methodChild는 구현 못함
    }
}

class Parent{
    String name = "Parent class";
    void methodParent(){
        System.out.println("Parent method"+this.name);
    }
}
class Child1 {
    Parent parent = new Parent() {
      int childField;
      void methodChild(){
          System.out.println("자식이 별도로 만든 메소드");
      }
      @Override
        void methodParent(){
          System.out.println("부모의 메소드를 오버라이딩");
      }
    }; // <- 익명 객체
}

class Child extends Parent{
    String name = "Child class";
    @Override
    void methodParent(){
        System.out.println("class name : "+this.name);
        System.out.println("class name : "+super.name);
    }
}