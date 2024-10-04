package 객체배열관리;

public class NameCard { // 객체 타입
    private String name;
    private String email;
    private String phone;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo(){
        System.out.println("이름 : "+name);
        System.out.println("이메일 주소 : "+email);
        System.out.println("핸드폰 번호 : "+phone);
        System.out.println("나이 : "+age);
    }
}
