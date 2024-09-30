package 정적멤버메소드;

import java.util.Date;
import java.text.SimpleDateFormat;
// 공통 메소드 미리 지정

public class Util {
    // 두 수의 최대값을 반환하는 메소드
    public static int max(int a, int b){
        return a > b ? a : b;
    }
    // 짝수 판별하기
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
    // 문자열을 입력 받아 시간 정보 출력
    public static String getCurrentDate(String fmt){
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }
    public static String getCurrentDate() {
        SimpleDateFormat sdf = new SimpleDateFormat();
        return sdf.format(new Date());
    }
}
