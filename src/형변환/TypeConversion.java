package 형변환;

public class TypeConversion {
    public static void main(String[] args) {
        // 형변환이란? -> 선언된 타입을 다른 타입으로 변환하는 것
        // 묵시적 형변환 : 자동 변환이라고 하기도 함, 컴파일러 유리한 방향으로 알아서 변경
        // 명시적 형변환 : 개발자가 명확한 의도를 가지고 형을 변경하는 것
        int num1 = 1, num2 = 4;
        double result1 = num1 / num2;// int형으로 계산되었기 때문에 형변환이 없다면 0이 나온다.
        double result2 = (double) num1 / num2; //
        // 묵시적 형변환 -> 앞쪽의 num1이 double 형태로 바꼈기 때문에 뒤쪽의 num2도 알아서 형변환이 된다.
        // 명시적 형변환과 묵시적 형변환이 함께 일어난다.
        System.out.println(result1);
        System.out.println(result2);

        System.out.println(""+result1+10); // 연산자 우선순위에 의해서 문자열로 간주
        System.out.println(result1+10+"10"); // 먼저 숫자형 타입이 계산

    }
}
