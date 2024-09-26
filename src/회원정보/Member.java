package 회원정보;
// 이름은 String
// 나이는 int, 0~199까지만 정상으로 간주, 이외의 값이 입력되면 재입력 요구
// 만약, 숫자가 아닌 다른 값이 오는 경우에 대한 처리는 일단 무시 (개별 진행 해도 됨)
// 성별은 문자 타입으로 입력, 남성은 'M'과 'm', 여성은 'F', 'f' -> 입력
// 성별에 대한 출력은 "남성", "여성"으로 출력
// 직업은 정수로 입력 (1~4) 입력하고, 1은 "학생", 2는 "회사원", 3은 "주부", 4는 "무직"
// 1 ~ 4 이외의 값은 재입력 요구

// 모든 입력이 완료되면 결과는 한번에 출력

import java.util.Scanner;

public class Member { // 불러오는 클래스
    // 필드 추가 ( 필드는 클래스 내에 존재하는 변수를 지칭 -> 인스턴스 필드, 정적 필드, 지역 필드)
    private String name; // 인스턴스 필드 -> 객체 필드?
    private int age; // private -> 접근 제한자, 같은 클래스 내에서만 접근 가능
    private char gender;
    private int job;
    private final Scanner scanner = new Scanner(System.in); // 클래스가 객체로 만들어질 때는 생성자 기반으로 만들어짐
    // 자바에서 생성자를 만들지 않으면 기본 생성자가 자동으로 만들어짐
    public void setName() { // 세터
        System.out.print("이름 입력 : ");
        name = scanner.nextLine(); // 같은 클래스 내에 name이 있어서 가능
    }
    public void setAge() { // 내부 메소드는 반환값이 없는 경우가 많다
        while (true){ // void는 반환값을 요구하지는 않지만 반환은 가능하다.
            System.out.print("나이 입력 : ");
            age = scanner.nextInt(); // 인스턴스 필드에 반환해놨기 때문에 return 값이 따로 필요하지 않다.
            if (age >= 0 && age <= 199) return;
            System.out.println("나이를 잘못 입력했습니다.");
        }
    }
    public void setGender() {
       while (true) {
           System.out.print("성별 입력 : ");
           gender = scanner.next().charAt(0); // 문자에 대한 입력은 문자열에 해당 인덱스의 문자를 추출
//        if (gender == 'M' || gender == 'm') {
//            System.out.println("남성");
//        } return;
//        else if (gender == 'F' || gender == 'f'){
//            System.out.println("여성");
//            } return;
//        else System.out.println("성별을 잘못 입력 했습니다.");
           switch (gender) {
               case 'M': case 'm': case 'F': case 'f': return;
               default:
                   System.out.println("성별을 잘못 입력 했습니다.");
           }
       }
    }
    public int getGenderType(){ // int가 붙었기 때문에 반환값이 존재 -> int형 반환 타입
        if (gender == 'M' || gender == 'm') return 1;
        else return 2;
    }

    public void setJob(){
        while (true){
            System.out.print("직업 입력 : ");
            job = scanner.nextInt();
            if (job > 0 && job <5) return;
            System.out.println("직업을 잘못 입력 했습니다.");
        }
    }

    public void getInfo() {
        String[] genderStr = {"", "남성", "여성"}; // 입력된 값과 배열의 인덱스를 일치하게 하기 위해서
        // return 값을 0,1 로 했으면 맨 앞의 공백 칸은 필요 없다?
        String[] jobStr = {"", "학생", "회사원", "주부", "무직"};
        System.out.println("======= 회원 정보 =======");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + genderStr[getGenderType()]);
        System.out.println("직업 : " + jobStr[job]); // setJob의 경우 void 타입이기 때문에 리턴값 X
    }

    Member(){ // 생성자 / 반환 타입 없음
        
    }
}
