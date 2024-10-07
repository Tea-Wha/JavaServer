package 래퍼클래스;
// 래퍼 클래스 : 8개의 기본 타입에 해당하는 데이터를 객체로 포장해 주는 클래스
// Wrapper 클래스 -> 기본 타입의 데이터를 객체 타입으로 취급하도록 변환해주는 클래스
// 일반화/ 제네릭을 위해서 래퍼클래스가 필요함



public class WrapperClass {
    public static void main(String[] args) {
//        IntegerEx integerEx = new IntegerEx(100);
//        integerEx.x = 100; // integerEx라는 참조 타입 -> 객체 (x)
//        System.out.println(integerEx.x);

        // Boxing : 기본 타입을 참조 내에 넣는 것
        Integer num = 100; // Auto Boxing
        int xx = num; // Auto Unboxing
        System.out.println(num);
        System.out.println(xx);

        Character ch = 'X';
        System.out.println(ch);
        char c = ch;
        System.out.println(c);

        Double d = 8.546;
        System.out.println(d);
    }
}

//class IntegerEx{
//    int x;
//    IntegerEx(int x){
//        this.x = x;
//    }
//}