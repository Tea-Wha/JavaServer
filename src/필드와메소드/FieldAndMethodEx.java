package 필드와메소드;
// 필드 : 변수의 속성을 표현하는 필드
// 메소드 : 동작을 규정, 함수와 동일한 형태이고 클래스 내부에 존재
// 자바는 클래스 기반의 언어 이므로 클래스 외부에 별도의 함수가 존재 할 수 없음

public class FieldAndMethodEx {
    public static void main(String[] args) { // main method
//        FieldAndMethodEx test = new FieldAndMethodEx();
//        int sum = test.sum(100,200);
//        System.out.println(sum);
        int sum = FieldAndMethodEx.sum(100,200); // 같은 클래스 내에서는 클래스 이름 생략 가능
        System.out.println(sum);
        System.out.println(sum(200,300));
        System.out.println(sum("Test","JAVA"));
        System.out.println(sum("Test",300));
        System.out.println(sum(1,2,3,4,5,6,7,8,9));
    }
//    // 인스턴스 메소드
//    int sum(int a, int b){
//        return a + b; // 
//    }
    // 클래스 메소드 -> 객체화 되지 않음 / 클래스 이름으로 접근해야 함, 매개변수 입력 존재, 반환값 존재
    static int sum(int a, int b){
        return a + b;
    }
    static String sum(String a, String b){ // 메소드 오버로딩
        return a+b;
    }
    static String sum(String a, int b){ // 메소드 오버로딩
        return a+b;
    }
    // 매개변수 개수를 알 수 없을 때 사용하는 방법
    static int sum(int ...val){ // Spread Operator (전개 연산자)
        int sum = 0;
        for (int e : val){
            sum += e;
        }
        return sum;
    }
}

class Car { // 클래스 외부에서 클래스 생성 가능
    static int productNumber = 0; // 클래스 필드
    static String company = "현대자동차"; // 클래스 필드
    String modelName; // 인스턴스 필드
    int speed; // 인스턴스 필드
    int horsePower; // 인스턴스 필드
    String color; // 인스턴스 필드
    // 매개변수가 있는 생성자
    Car(String name, int speed, int power, String color){
        modelName = name;
        this.speed = speed; // this. -> self
        horsePower = power;
        this.color = color;
        productNumber +=1 ; // 클래스 필드
    }
}

// Call Stack -> 쌓이는 구조
// main 이 가장 맨 밑에 깔려 있음
// sum (위로 쌓임)
// 위에서부터 아래로 순차적 실행 -> main 이 맨 마지막


// 필드 -> 자바프로그래밍에서 '필드'는 클래스 내부에 선언된 변수를 의미
// 1. 데이터 저장 : 필드는 데이터를 저장하는 역할
// 2. 인스턴스 변수
// 3. 접근 제한자 : private, protected, public 등
// 4. 데이터 타입
// 5. 초기값 설정
// 6. 클래스 변수 : static 키워드로 선언 -> 클래스 변수는 클래스의 모든 객체가 공유하는 하나의 데이터
// 7.
// 8.
// 9. Getter, Setter 메소드