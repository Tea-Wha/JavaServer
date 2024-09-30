package 접근제한자;

public class Parent {
    public String name; // 접근 제한자가 없으면 default, 같은 패키지 내에서만 접근 가능
    public String money; // private -> 같은 클래스 아니면 접근 불가능
    protected String addr; // protected -> 같은 패키지이거나 상속 관계가
    // 존재하면 접근 가능
    public Parent(){ // class가 안붙어있으면 일반적으로 메소드? 메소드
        name = "이건희";
        money = "2000억";
        addr = "서울시 강남구 역삼동";
    }

}
