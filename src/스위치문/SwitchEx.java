package 스위치문;
// switch 문은 if 문과 마찬가지로 조건 제어문 입니다.
// if 문은 조건식의 결과가 true 또는 false에 따라 분기하고,
// switch 문은 변수의 값에 따라 실행문이 결정
// switch(변수) {
// case 값 : 정수, 문자, 문자열이 올 수 있다
// 실행문
// break; // switch 문 탈출

import java.util.Scanner;
public class SwitchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계절 입력 : ");
        String season = sc.next(); // String은 대문자 시작 -> 주소값만 들어가 있음
        // season에 문자열이 들어가있는게 아니고 주소값이 들어가 있는 것

//        if (season.equals("spring")){
//            System.out.println("봄 입니다.");
//        } else if (season.equals("summer")){
//            System.out.println("여름 입니다.");
//        } else if (season.equals("fall") || season.equals("autumn")){
//            System.out.println("가을 입니다.");
//        } else if (season.equals("winter")){
//            System.out.println("겨울 입니다.");
//        } else{
//            System.out.println("잘못 입력했습니다.");
//        }
        // C는 case 값에 문자가 오지 못함
        switch(season){
            case "spring":
                System.out.println("봄 입니다.");
                break;
            case "summer":
                System.out.println("여름 입니다.");
                break;
            case "fall": case "autumn":
                System.out.println("가을 입니다.");
                break;
            case "winter":
                System.out.println("겨울 입니다.");
                break;
            default:
                System.out.println("잘못 입력했습니다.");
        }
        
        // String (참조 변수) 예제
        String name = "홍태화"; // 동적이 아닌 static 부분이라서 그런건가?
        String addr = "홍태화"; // static 영역 메모리 저장 -> static 쪽에서 동일한 값의 메모리는 하나로 합쳐짐
        // 문자열 -> 리터럴 상수열 -> heap 메모리 영역에 저장됨 (이게 주소?)
        // 변수 -> 리터럴 상수열에 연결 (하지만 같은 문자열은 이미 같은 주소에 있음?)

        if (name == addr){
            System.out.println("name과 addr의 주소가 같습니다."); //주소 같음
        } else{
            System.out.println("name과 addr의 주소가 다릅니다.");
        }
        if (name.equals(addr)){
            System.out.println("name과 addr의 내용이 같습니다.");
        } else{
            System.out.println("name과 addr의 내용이 다릅니다.");
        }

        Scanner tw = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String test = tw.next(); // heap 영역 메모리 저장
        Scanner tw1 = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String test1 = tw1.next();

        if (test == test1){ // 이 구문은 주소를 확인하는 것
            System.out.println("test와 test1의 주소가 같습니다.");
        } else{
            System.out.println("test와 test1의 주소가 다릅니다.");
        }
        if (test.equals(test1)){ // 이 구문은 내용을 확인하는 것
            System.out.println("test와 test1의 내용이 같습니다.");
        } else{
            System.out.println("test와 test1의 내용이 다릅니다.");
        }
    }
}
