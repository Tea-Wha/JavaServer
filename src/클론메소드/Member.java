package 클론메소드;

// Cloneable 인터페이스는 복제 허용에 대한 부분
public class Member implements Cloneable{ // 복제 허용에 대한 implements
    String id;
    String name;
    String password;
    int age;
    boolean isAdult;

    public Member(String id, String name, String password, int age, boolean isAdult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.isAdult = isAdult;
    }
    public Member getMember(){ // 반환값이 Member
        Member cloned = null;
        try{
            cloned = (Member) clone(); // 클론 메소드는 Object 타입이므로 형 변환이 필요
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }
}
