package 비트연산자;

public class BitOperatorEx {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 12;
        System.out.println(num1 & num2); // and
        System.out.println(num1 | num2); // or
        System.out.println(num1 ^ num2); // xor
        System.out.println(~num1); // not
        System.out.println(num1 << 1); // 왼쪽으로 1 비트 shift
        System.out.println(num1 >> 1); // 오른쪽으로 1 비트 shift
        System.out.println(~num2);
        System.out.println(num2 << 1);
        System.out.println(num2 >> 1);
        System.out.println(num1 >> 2);
        System.out.println(num1 >> 3);
    }
}
