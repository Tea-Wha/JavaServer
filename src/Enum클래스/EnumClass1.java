package Enum클래스;

import java.util.Calendar;

enum DevType{
    MOBILE, FRONTEND, BACKEND, DBA, ANALYSIS
}
enum Career{
    JUNIOR, SENIOR
}
enum Gender{
    MALE,FEMALE
}

class Developer {
    private String name;
    private DevType type;
    private Career career;
    private Gender gender;

    public Developer(String name, DevType type, Career career, Gender gender) {
        this.name = name;
        this.type = type;
        this.career = career;
        this.gender = gender;
    }
    public void devInfo(){
        System.out.println("이름 : "+name);
        System.out.println("업무 : "+type);
        System.out.println("경력 : "+career);
        System.out.println("성별 : "+gender);
    }
}

public class EnumClass1 { // 호이스팅 -> 순서 상관 없음 (자바/자바스크립트 가능) -> 객체 지향
    // 나머지 언어들은 함수나 메소드/클래스가 메인보다 위에 있어야 함 -> 절차 지향
    public static void main(String[] args) { // 타입 제한
        Developer developer = new Developer("홍태화",DevType.FRONTEND,Career.JUNIOR,Gender.MALE);
        developer.devInfo();
    }
}
