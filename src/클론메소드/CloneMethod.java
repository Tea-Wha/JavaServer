package 클론메소드;
// clone() : 해당 인스턴스를 복제하여, 새로운 인스턴스를 생성해 반환 (얕은 복사가 발생하는 경우)
// 얕은 복사 : 필드의 값만 복사하는 방법, 기본 타입의 경우 값이 복사됨, 
// 참조 타입의 경우는 참조하는 곳의 주소가 복사됨

public class CloneMethod {
    public static void main(String[] args) {
        Member mem1 = new Member("htw7880", "홍태화","^xoghk18",29,true);
        Member mem2 = mem1.getMember(); // 얕은 복사가 일어남

        mem2.id = "test1234";
        mem2.name = "TEST";

        System.out.println("이름 : "+mem1.name);
        System.out.println("이름 : "+mem2.name);

        System.out.println("ID : "+mem1.id);
        System.out.println("ID : "+mem2.id);
    }
}
