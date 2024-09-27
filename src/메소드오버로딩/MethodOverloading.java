package 메소드오버로딩;
// 메소드 오버로딩 -> 같은 이름의 메소드를 중복하여 정의 하는 것 (정적 바인딩)
// 매개변수의 타입이나 개수로 구분 (오버로딩의 조건)
// 다형성을 구현하는 중요 요소
// 반환값이나 접근제한자는 해당 사항 없음
// println() 메소드
// println() println(boolean x) println(char x) println(char[] x) println(double x)
// println(float x) println(int x) println(long x) println(Object x) println(String x)
// 메소드 오버로딩의 조건 1.메소드의 이름이 같아야 한다.
// 2. 매개변수의 개수 또는 타입이 달라야 한다. -> 한 메소드에 여러 개수, 타입이 올 수 있어야 한다.
// 정적 바인딩
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(10, 20)); // 정수 반환
        System.out.println(sum(10, 20, 30)); // 정수 반환
        System.out.println(sum(10, 3.33, 4.55)); // 실수 반환
        System.out.println(sum("SUM :", 10, 20)); // 문자열 반환
        System.out.println(sum(10,20,30,40,50,60));
    }
    static int sum(int x, int y){
        return x + y;
    }
    static int sum(int x, int y, int z){
        return x + y + z;
    }
    static int sum(int ...val){
        int x = 0;
        for (int i :val)  x += i;
        return x;
    }
    static double sum(double x, double y, double z){
        return x + y + z;
    }
    static String sum(String x, int y, int z){
        return x + y + z;
    }
}
