package 접근제한자;
// 접근제한자란? 클래스와 인터페이스를 다른 패키지랑 클래스에서의 접근을 제한하는 용도
// public class는 한 클래스 내에 하나만 존재 가능?

public class AccessModifier { // 기본적으로 패키지 안의 클래스
    public static void main(String[] args) {
        Child child = new Child("개발자");
        System.out.println(child.getJob());
        System.out.println(child.getMoney()); // 부무로부터 상속 받은 돈
        System.out.println(child.getName()); // 부모님이 물려준 이름
        System.out.println(child.getAddr()); // 부모님이 물려준 주소
    }
}

class Child extends Parent { // 상속
    String job; // new 변수

    public Child(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public String getMoney(){
        return money;
    }
    public String getName(){
        return name; // public이나 protected의 접근제한자라면 다른 패키지 내의
        // 클래스 내에 존재하더라도 접근 가능
    }
    public String getAddr(){
        return addr;
    }
}
