package 싱글톤;

public class Singleton {
    String name;
    int id;
    private static Singleton singleton = new Singleton();
    // static 변수 <- Heap 영역 객체
    // singleton -> 객체의 주소 참조 (유일한 주소)
    // 객체가 끝까지 살아남게 만들기 위해서 참조 변수에 static 을 붙임
    private Singleton(){ // 외부에서 부르지 못함 -> 한번만 불러야 되기 때문에
        name = "곰돌이사육사";
        id = 100;
    }
    static Singleton getSingleton(){
        return singleton;
    }
}
