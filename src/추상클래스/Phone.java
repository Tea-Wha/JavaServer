package 추상클래스;

public abstract class Phone { // 명시적으로 abstract 키워드 사용해서 추상클래스 생성
    String name;
    boolean isPower;
    public Phone(String name){
        this.name = name;
    }
    // 일반 메소드
    public void setPower(boolean isPower){
        this.isPower = isPower;
        if (isPower){
            System.out.println("Phone 의 전원을 킵니다.");
        } else {
            System.out.println("Phone 의 전원을 끕니다.");
        }
    }
    abstract void call(); // 추상 메소드는 구현부가 없어야함 // 이름만 존재하는 추상메소드
    // 상속 받은 자식 클래스에서 반드시 구현해야함
}
