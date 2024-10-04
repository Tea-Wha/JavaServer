package 스트링버퍼;
// 기본적으로 문자열처리는 String 클래스를 사용하는 것이 일반적임
// String 클래스로 문자열을 처리하는 경우 매번 새로운 문자열이 만들어짐
// StringBuffer, StringBuilder 는 객체를 생성해 할당된 메모리에 계속 추가해 나가는 방식
// StringBuffer, StringBuilder는 사용 방법이 완전 동일
// StringBuffer : 멀티 스레드 환경을 지원하고 StringBuilder는 지원하지 않음 // StringBuffer 느림
// StringBuilder가 기본

public class StringBufferEx {
    public static void main(String[] args) {
        String rst = ""; // 빈 문자열 (값이 없다) / null -> 참조하는 객체가 없다
        // 둘 다 되는 이유는 자바가 알아서 변환
//        rst += "안녕하세요.";
//        rst += " ";
//        rst += "자바";
//        rst += " 공부합니다.";
//        System.out.println(rst); // 문자열 추가 방식 -> 새로운 메모리에 새로운 문자열 추가 방식
        StringBuffer sb = new StringBuffer(); // 할당 받은 주소에 값을 누적해 나가는 방식
        sb.append("안녕하세요");
        sb.append(" ");
        sb.append("파이썬");
        sb.append(" 공부합니다.");
        sb.insert(0,"hello ");
        System.out.println(sb.substring(0,4));
        sb.delete(0,2);
        System.out.println(sb);
        System.out.println(sb.toString()); // String 클래스로 반환
        System.out.println(sb.substring(0,4));

        StringBuilder sa = new StringBuilder(); // 할당 받은 주소에 값을 누적해 나가는 방식
        sa.append("안녕하세요");
        sa.append(" ");
        sa.append("파이썬");
        sa.append(" 공부합니다.");
        System.out.println(sa);
    }
}
